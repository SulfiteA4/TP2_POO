/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Lucas
 */
public class Pix extends Pagamento{
    private String codigoPix;

    public Pix(String codigoPix, int codigoNota) {
        super(codigoNota);
        this.codigoPix = codigoPix;
    }

    public String getCodigoPix() {
        return codigoPix;
    }

    public void setCodigoPix(String codigoPix) {
        this.codigoPix = codigoPix;
    }
    
    public void gerarCodigoPix(){}

    @Override
    public String toString() {
        return "\nPix: " + 
               "\n\tCodigo Pix: " + codigoPix;
    }
    
    
}
