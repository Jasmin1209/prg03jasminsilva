/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author USER
 */
public class Piramide extends Formas3D{
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double obterArea(){
        double areaBase = base * base;
        double areaLateral = 2 * base * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return areaBase + areaLateral;
    }
    
    @Override
    public double obterVolume(){
        return (base * base * altura) / 3;
    }
    
    @Override
    public String toString(){
        return "Pirâmida (base = " + base + ", altura = " + altura + ")";
    }
}
