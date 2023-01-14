    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.ComercioEletronico;

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
}
