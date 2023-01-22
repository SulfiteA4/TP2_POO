    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Cliente;
import Models.ComercioEletronico;
import Models.Gerente;
import Models.IOArquivos;
import Models.ItemVenda;
import Models.Pagamento;
import Models.Produto;
import Models.Transportadora;
import Models.Venda;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lucas
 */
public class ControladorVenda {
    public static ComercioEletronico COM = new ComercioEletronico();
    
    public String getConfigVenda(){
        return COM.getConfiguracoes().getArquivoVendas();
    }
    
    public String getConfigTransportadora(){
        return COM.getConfiguracoes().getArquivoTransportadoras();
    };
    
    public void addVenda(int codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, ArrayList<ItemVenda> itensDaVenda, float valorTotal, Pagamento formaPagamento, Transportadora transportadora){
        IOArquivos arq = new IOArquivos();
        Venda venda = new Venda(codigo, cliente, gerente, dataVenda, null, itensDaVenda, valorTotal, 0, formaPagamento, transportadora);
        LocalDate dataDaEntrega = venda.calcularDataEntrega(); 
        venda.setDataDaEntrega(dataDaEntrega);
        venda.setValorComDesconto(venda.calcularValorTotal());
        arq.escreverVendas(venda);
    }
    
    public ItemVenda AddItemVenda(Produto produto, float valor, int quantidade){
        ItemVenda itens = new ItemVenda(produto, valor, quantidade);
        return itens;
    }
    
    
        
    public Transportadora buscaTransportadoraPorCodigo(int codigo){
            IOArquivos arq = new IOArquivos(); 
            //Padrão Iterator!
            Iterator<Transportadora> iterator = arq.lerTransportadora().iterator();
        
            while (iterator.hasNext()) {
            
                Transportadora transportadora = iterator.next();
            
                if(transportadora.getCodigo() == codigo){
                    return(transportadora);
                }
        }
        
        return(null);
            
    } 
    
}
