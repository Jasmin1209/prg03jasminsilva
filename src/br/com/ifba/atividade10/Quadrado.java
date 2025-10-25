/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author USER
 */
public class Quadrado extends Formas2D{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override 
    public double obterArea(){
        return lado * lado;
    }
    
    @Override
    public String toString(){
        return "Quadrado (lado: " + lado + ")"; 
    }
}
