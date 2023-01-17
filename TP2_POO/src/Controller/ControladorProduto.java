    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.ComercioEletronico;
import Models.IOArquivos;
import Models.Movel;
import Models.Produto;
import java.util.ArrayList;
import java.util.Iterator;

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

    
    
    
    
    
    
    
}
