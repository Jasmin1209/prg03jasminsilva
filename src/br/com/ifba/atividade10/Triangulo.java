/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author USER
 */
public class Triangulo extends Formas2D{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override 
    public double obterArea(){
        return (base * altura) / 2;
    }
    
    @Override
    public String toString(){
        return "Triângulo (base " + base + " altura " + altura + ")";
    }
}
