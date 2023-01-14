/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Lucas
 */
public class Dinheiro extends Pagamento{

    public Dinheiro(int codigoNota) {
        super(codigoNota);
    }
    
    @Override 
    public String toString(){
        return "Dinheiro";
    }
}
