    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.ControladorProduto.COM;
import Models.ComercioEletronico;

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
}
