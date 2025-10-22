/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author USER
 */
public interface Pagamento {
    public double calcularTotal(double valor);
    public String imprimirRecibo(double valor);
}
