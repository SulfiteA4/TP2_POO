/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Eletrodomestico extends Produto{
    
    
    public Eletrodomestico(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor, Fabricante fabricante, boolean disponivel) {
        super(codigo, nome, descricao, dataFabricacao, valor, fabricante, disponivel);
    }

    
    @Override
    public float calcularValor(){
        float taxaImposto = (float) 0.035 * this.valor;//3,5%
        
        return this.valor + taxaImposto;
    }
    
    @Override
    public String toString() {
        return  "\nEletrodomestico:" +
                    "\n\tCodigo: " + codigo + 
                    "\n\tNome: " + nome + 
                    "\n\tDescricao: " + descricao + 
                    "\n\tData da Fabricacao: " + dataFabricacao + 
                    "\n\tValor: " + valor + 
                    "\n\tFabricante: " + fabricante + 
                    "\n\tDisponivel: " + ((disponivel)?"Sim":"Nao")+
                    "______________________________";
    }
}
