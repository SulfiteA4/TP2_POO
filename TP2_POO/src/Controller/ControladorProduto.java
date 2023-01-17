    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.ComercioEletronico;

import Models.Fabricante;

import Models.Eletrodomestico;
import Models.Eletronico;

import Models.IOArquivos;
import Models.Movel;
import Models.Produto;
import Models.Vestuario;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ControladorProduto {
    public static ComercioEletronico COM = new ComercioEletronico();
    
    public String getConfigProduto(){
        return COM.getConfiguracoes().getArquivoProdutos();
    }
    
    public String getConfigFabricantes(){
        return COM.getConfiguracoes().getArquivoFabricantes();
    }
    
    public void addProduto(Produto produto){
        IOArquivos arq = new IOArquivos();
        arq.escreverProduto(produto);
    }
    
    public void addFabricante(Fabricante fabricante){
        IOArquivos arq = new IOArquivos(); 
        arq.escreverFabricante(fabricante);
    }
    
    
    
    public Object[][] relatorioTodosProdutos(){
        IOArquivos arq = new IOArquivos();
        int cont = 0;
        Object[][] linha = new Object[arq.lerProdutos().size()][7];
        
        //Padrão Iterator!
        Iterator<Produto> iterator = arq.lerProdutos().iterator();
        
        while (iterator.hasNext()) {
            
            Produto produto = iterator.next();
            
            linha[cont][0] = produto.getCodigo();
            linha[cont][1] = produto.getNome();
            linha[cont][2] = produto.getDescricao();
            linha[cont][3] = produto.getDataFabricacao();
            linha[cont][4] = produto.getValor();
            linha[cont][5] = produto.getFabricante();
            linha[cont][6] = produto.isDisponivel();
            cont++;
        }
        
        return(linha);
    }

    
    public Object[][] relatorioTodosFabricantes(){
        IOArquivos arq = new IOArquivos();
        int cont = 0;
        Object[][] linha = new Object[arq.lerFabricantes().size()][7];
        
        //Padrão Iterator!
        Iterator<Fabricante> iterator = arq.lerFabricantes().iterator();
        
        while (iterator.hasNext()) {
            
            Fabricante fabricante = iterator.next();
            
            linha[cont][0] = fabricante.getCodigo();
            linha[cont][1] = fabricante.getNome();
            linha[cont][2] = fabricante.getCnpj();
            linha[cont][3] = fabricante.getDescricao();
            linha[cont][4] = fabricante.getEmail();
            linha[cont][5] = fabricante.getEndereco();
            linha[cont][6] = fabricante.getTelefone();
            cont++;
        }
        
        return(linha);
    }

        
         public Produto buscaProdutoPorCodigo(int codigo){
            IOArquivos arq = new IOArquivos(); 
            //Padrão Iterator!
            Iterator<Produto> iterator = arq.lerProdutos().iterator();
        
            while (iterator.hasNext()) {
            
                Produto produto = iterator.next();
            
                if(produto.getCodigo() == codigo){
                    return(produto);
                }
        }
        
        return(null);
            
        }  
    

    
    public Object[][] relatorioMoveis(){
        int cont = 0;
        Object[][] linha = new Object[this.getMoveis().size()][7];
        
        //Padrão Iterator!
        Iterator<Produto> iterator = this.getMoveis().iterator();
        
        while (iterator.hasNext()) {
            
            Produto produto = iterator.next();
            
            linha[cont][0] = produto.getCodigo();
            linha[cont][1] = produto.getNome();
            linha[cont][2] = produto.getDescricao();
            linha[cont][3] = produto.getDataFabricacao();
            linha[cont][4] = produto.getValor();
            linha[cont][5] = produto.getFabricante();
            linha[cont][6] = produto.isDisponivel();
            cont++;
        }
        
        return(linha);
    }
    
    public Object[][] relatorioEletrodomesticos(){
        int cont = 0;
        Object[][] linha = new Object[this.getEletrodomesticos().size()][7];
        
        //Padrão Iterator!
        Iterator<Produto> iterator = this.getEletrodomesticos().iterator();
        
        while (iterator.hasNext()) {
            
            Produto produto = iterator.next();
            
            linha[cont][0] = produto.getCodigo();
            linha[cont][1] = produto.getNome();
            linha[cont][2] = produto.getDescricao();
            linha[cont][3] = produto.getDataFabricacao();
            linha[cont][4] = produto.getValor();
            linha[cont][5] = produto.getFabricante();
            linha[cont][6] = produto.isDisponivel();
            cont++;
        }
        
        return(linha);
    }
    
    public Object[][] relatorioEletronicos(){
        int cont = 0;
        Object[][] linha = new Object[this.getEletronicos().size()][7];
        
        //Padrão Iterator!
        Iterator<Produto> iterator = this.getEletronicos().iterator();
        
        while (iterator.hasNext()) {
            
            Produto produto = iterator.next();
            
            linha[cont][0] = produto.getCodigo();
            linha[cont][1] = produto.getNome();
            linha[cont][2] = produto.getDescricao();
            linha[cont][3] = produto.getDataFabricacao();
            linha[cont][4] = produto.getValor();
            linha[cont][5] = produto.getFabricante();
            linha[cont][6] = produto.isDisponivel();
            cont++;
        }
        
        return(linha);
    }
    

        public Fabricante buscaFabrincantePorCodigo(int codigo){
            IOArquivos arq = new IOArquivos(); 
            //Padrão Iterator!
            Iterator<Fabricante> iterator = arq.lerFabricantes().iterator();
        
            while (iterator.hasNext()) {
            
                Fabricante fabricante = iterator.next();
            
                if(fabricante.getCodigo() == codigo){
                    return(fabricante);
                }
        }
        
        return(null);
            
        }  
    
    public int retornaQuantidadeFabricantes(){
        IOArquivos arq = new IOArquivos();
        int cont;
        try{
            cont = arq.lerFabricantes().size();
        }catch(NullPointerException e){
            cont = 0;
        }
        return(cont);
    }

    public Object[][] relatorioVestuario(){
        int cont = 0;
        Object[][] linha = new Object[this.getVestuario().size()][7];
        
        //Padrão Iterator!
        Iterator<Produto> iterator = this.getVestuario().iterator();
        
        while (iterator.hasNext()) {
            
            Produto produto = iterator.next();
            
            linha[cont][0] = produto.getCodigo();
            linha[cont][1] = produto.getNome();
            linha[cont][2] = produto.getDescricao();
            linha[cont][3] = produto.getDataFabricacao();
            linha[cont][4] = produto.getValor();
            linha[cont][5] = produto.getFabricante();
            linha[cont][6] = produto.isDisponivel();
            cont++;
        }
        
        return(linha);
    }


    
    public ArrayList<Produto> getMoveis(){
        IOArquivos arq = new IOArquivos();
        Iterator iterator = arq.lerProdutos().iterator();
        ArrayList<Produto> moveis = new ArrayList();
        
        while(iterator.hasNext()){
            Produto produto = (Produto) iterator.next();
            
            if(produto instanceof Movel){
                moveis.add(produto);
            }
        }
        return moveis;
    }
 
    public ArrayList<Produto> getEletrodomesticos(){
        IOArquivos arq = new IOArquivos();
        Iterator iterator = arq.lerProdutos().iterator();
        ArrayList<Produto> eletrodomestico = new ArrayList();
        
        while(iterator.hasNext()){
            Produto produto = (Produto) iterator.next();
            
            if(produto instanceof Eletrodomestico){
                eletrodomestico.add(produto);
            }
        }
        return eletrodomestico;
    }
    
    public ArrayList<Produto> getEletronicos(){
        IOArquivos arq = new IOArquivos();
        Iterator iterator = arq.lerProdutos().iterator();
        ArrayList<Produto> eletronicos = new ArrayList();
        
        while(iterator.hasNext()){
            Produto produto = (Produto) iterator.next();
            
            if(produto instanceof Eletronico){
                eletronicos.add(produto);
            }
        }
        return eletronicos;
    }
    
    public ArrayList<Produto> getVestuario(){
        IOArquivos arq = new IOArquivos();
        Iterator iterator = arq.lerProdutos().iterator();
        ArrayList<Produto> vestuario = new ArrayList();
        
        while(iterator.hasNext()){
            Produto produto = (Produto) iterator.next();
            
            if(produto instanceof Vestuario){
                vestuario.add(produto);
            }
        }
        return vestuario;
    }
    
    
}
