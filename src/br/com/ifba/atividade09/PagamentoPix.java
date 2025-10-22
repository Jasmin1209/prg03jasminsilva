/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author USER
 */
public class PagamentoPix implements Pagamento{
    private double valorPix;

    

    public double getValorPix() {
        return valorPix;
    }

    public void setValorPix(double valorPix) {
        this.valorPix = valorPix;
    }

    @Override
    public double calcularTotal(double valor) {
        double cashback;
        cashback = (valor * 2) / 100;
        
        return this.valorPix = cashback;
    }

    @Override
    public String imprimirRecibo(double valor) {
        return "Valor: R$ " + String.format("%.2f", valor) + "\n"
                + "  CashBack: R$ " + String.format("%.2f", valor * 0.02) + "\n"
                + "  Valor Final: R$ " + String.format("%.2f", valor - (valor * 0.02));
    }
    
    
}
