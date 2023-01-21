/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Lucas
 */
public class ItemVenda {
    private int codProduto;
    private float valor;
    private int quantidade;

    public ItemVenda() {
    }

    public ItemVenda(Produto produto, float valor, int quantidade) {
        this.codProduto = codProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Produto produto) {
        this.codProduto = codProduto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float calcularValorTotal(){ //a se pensar
        return 0;
    }
    
    
}
