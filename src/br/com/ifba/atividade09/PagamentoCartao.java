/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author USER
 */
public class PagamentoCartao implements Pagamento{
    private double valorCartao;


    public double getValorCartao() {
        return valorCartao;
    }

    public void setValorCartao(double valorCartao) {
        this.valorCartao = valorCartao;
    }
    
    @Override
    public double calcularTotal(double valor){
        double taxa;
        taxa = (5 * valor) / 100;
        
        return this.valorCartao = valor + taxa;   
    }
    
    @Override
    public String imprimirRecibo(double valor) {
        return "Valor: R$ " + String.format("%.2f", valor) + "\n"
                + "  Taxa: R$ " + String.format("%.2f", valor * 0.05) + "\n"
                + "  Valor Final: R$ " + String.format("%.2f", valor + (valor * 0.05));
    }

}
