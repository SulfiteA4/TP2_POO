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
import Models.Transportadora;
import Models.Venda;
import java.time.LocalDate;
import java.util.ArrayList;

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
    
    public void addVenda(int codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, LocalDate dataDaEntrega, ArrayList<ItemVenda> itensDaVenda, float valorTotal, float valorComDesconto, Pagamento formaPagamento, Transportadora transportadora){
        IOArquivos arq = new IOArquivos();
        Venda venda = new Venda(codigo, cliente, gerente, dataVenda, dataDaEntrega, itensDaVenda, valorTotal, valorComDesconto, formaPagamento, transportadora);
        arq.escreverVendas(venda);
    }
    
    
}
