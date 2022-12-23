/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Venda {
    private int codigo;
    private Cliente cliente;
    private Gerente gerente;
    private LocalDate dataVenda;
    private LocalDate dataDaEntrega;
    private ArrayList<ItemVenda> itensDaVenda;
    private float valorTotal;
    private float valorComDesconto;
    private Pagamento formaPagamento;
    private Transportadora transportadora;

    public Venda() {
    }

    public Venda(int codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, LocalDate dataDaEntrega, ArrayList<ItemVenda> itensDaVenda, float valorTotal, float valorComDesconto, Pagamento formaPagamento, Transportadora transportadora) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.gerente = gerente;
        this.dataVenda = dataVenda;
        this.dataDaEntrega = dataDaEntrega;
        this.itensDaVenda = itensDaVenda;
        this.valorTotal = valorTotal;
        this.valorComDesconto = valorComDesconto;
        this.formaPagamento = formaPagamento;
        this.transportadora = transportadora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public LocalDate getDataDaEntrega() {
        return dataDaEntrega;
    }

    public void setDataDaEntrega(LocalDate dataDaEntrega) {
        this.dataDaEntrega = dataDaEntrega;
    }

    public ArrayList<ItemVenda> getItensDaVenda() {
        return itensDaVenda;
    }

    public void setItensDaVenda(ArrayList<ItemVenda> itensDaVenda) {
        this.itensDaVenda = itensDaVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(float valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }
    
    
    
    public float calcularValorTotal(){
        return 0;
    }
    
    public void calcularDataEntrega(){
    
    }
    
//    necessário implementar
    
//    public ItemVenda addItemVenda(ItemVenda item){
//    
//    }
    
    
    
}
