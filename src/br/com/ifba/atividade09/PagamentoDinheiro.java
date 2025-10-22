/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author USER
 */
public class PagamentoDinheiro implements Pagamento{
    private double valorDinheiro;

    
    public double getValorDinheiro() {
        return valorDinheiro;
    }

    public void setValorDinheiro(double valorDinheiro) {
        this.valorDinheiro = valorDinheiro;
    }
    
    @Override
    public double calcularTotal(double valor) {
        double desconto = (valor * 10) / 100;
        
        this.valorDinheiro = valor - desconto;
        return valorDinheiro;
    }
    
    @Override
    public String imprimirRecibo(double valor) {
        return "Valor: R$ " + String.format("%.2f", valor) + "\n"
                + "  Desconto: R$ " + String.format("%.2f", valor * 0.10) + "\n"
                + "  Valor Final: R$ " + String.format("%.2f", valor - (valor * 0.10));
    }
    
}
