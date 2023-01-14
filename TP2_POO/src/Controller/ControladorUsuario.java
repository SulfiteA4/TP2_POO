/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.ComercioEletronico;
import Models.Configuracao;
import Models.IOArquivos;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ControladorUsuario {
    public static ComercioEletronico COM = new ComercioEletronico();
    
    public Configuracao getConfiguracoes(){
        return COM.getConfiguracoes();
    }
    
    public void setConfiguracoes(Configuracao config){
        COM.setConfiguracoes(config);
        IOArquivos arq = new IOArquivos();
        arq.escreverConfig(config);
        JOptionPane.showMessageDialog(null, "configurações salvas com sucesso!");
    }
    
    public String getConfigClientes(){
        return COM.getConfiguracoes().getArquivoClientes();
    }
    
    public String getConfigGerentes(){
        return COM.getConfiguracoes().getArquivoGerentes();
    }
}
