/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Controller.ControladorUsuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class IOArquivos {
    public Configuracao lerConfig(){
        try{
            File arquivoConfig = new File("config.arq");
            
            Configuracao configAtual;
            FileInputStream ios;
            if (arquivoConfig.exists() == false){
                configAtual = new Configuracao();
                this.escreverConfig(configAtual);
                return configAtual;
            }
            
            ios = new FileInputStream(arquivoConfig);
            ObjectInputStream ois = new ObjectInputStream(ios);
            
            configAtual = (Configuracao) ois.readObject();
            return configAtual;
            
        }catch( FileNotFoundException ex){
            return null;
        }catch(IOException | ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverConfig(Configuracao novaConfig){
        try{
            File configFile = new File("config.arq");
            
            if(configFile.exists() == false)configFile.createNewFile();
            
            FileOutputStream fos = new FileOutputStream("config.arq");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            ous.writeObject(novaConfig);
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo de configurações!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo de configurações!");
        }
    }
    
    
    public ArrayList<Venda> lerVendas(){
        try{
            ControladorUsuario control = new ControladorUsuario();
            FileInputStream fis = new FileInputStream(control.getConfigClientes());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contVendas = ois.readInt();
            ArrayList<Venda> vendas = new ArrayList<>();
            
            for(int i = 0; i < contVendas; i++){
                vendas.add((Venda) ois.readObject());
            }
            
            return vendas;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    
    public ArrayList<Cliente> lerClientes(){
        try{
            ControladorUsuario control = new ControladorUsuario();
            FileInputStream fis = new FileInputStream(control.getConfigClientes());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contClientes = ois.readInt();
            ArrayList<Cliente> clientes = new ArrayList<>();
            
            for(int i = 0; i < contClientes; i++){
                clientes.add((Cliente) ois.readObject());
            }
            
            return clientes;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public ArrayList<Gerente> lerGerentes(){
        try{
            ControladorUsuario control = new ControladorUsuario();
            FileInputStream fis = new FileInputStream(control.getConfigGerentes());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contGerentes = ois.readInt();
            ArrayList<Gerente> gerentes = new ArrayList<>();
            
            for(int i = 0; i < contGerentes; i++){
                gerentes.add((Gerente) ois.readObject());
            }
            
            return gerentes;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverCliente(Cliente cliente){
        
        try {
            ControladorUsuario control = new ControladorUsuario();
            File arquivoClientes = new File(control.getConfigClientes());
            ArrayList<Cliente> clientes;
            clientes = lerClientes();
            
            int contClientes;
            
            if(arquivoClientes.exists() == false) arquivoClientes.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoClientes);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(clientes != null){
                clientes.add(cliente);
                contClientes = clientes.size();
                ous.writeInt(contClientes);
                for(int i = 0;i<contClientes;i++){
                    ous.writeObject(clientes.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(cliente);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Clientes");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void escreverGerente(Gerente gerente){
        
        try {
            ControladorUsuario control = new ControladorUsuario();
            File arquivoGerentes = new File(control.getConfigGerentes());
            ArrayList<Gerente> gerentes;
            gerentes = lerGerentes();
            
            int contClientes;
            
            if(arquivoGerentes.exists() == false) arquivoGerentes.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoGerentes);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(gerentes != null){
                gerentes.add(gerente);
                contClientes = gerentes.size();
                ous.writeInt(contClientes);
                for(int i = 0;i<contClientes;i++){
                    ous.writeObject(gerentes.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(gerente);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Gerente Cadastrado Com Sucesso!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Gerente");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
