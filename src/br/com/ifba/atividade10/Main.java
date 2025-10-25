/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Formas[] formas = new Formas[6];
        
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(6, 3);
        formas[3] = new Esfera(2);
        formas[4] = new Cubo(3);
        formas[5] = new Piramide(4, 5);
        
        for(Formas f : formas){
            System.out.println("\n" + f.toString());
            
            if( f instanceof Formas2D){ //verifica se o objeto é instanciado pela classe Formas 2D
                Formas2D formas2d = (Formas2D) f; // faz f ser 'instanciada' por formas2d para conseguir acessar os métodos
                System.out.printf("Área: %.2f\n", formas2d.obterArea());
            } else if (f instanceof Formas3D){ //verifica se o objeto é instanciado pela classe Formas 3D
                Formas3D formas3d = (Formas3D) f; //faz f ser 'instanciada' por formas3d para conseguir acessar os métodos
                System.out.printf("Área: %.2f\n", formas3d.obterArea());
                System.out.printf("Volume: %.2f\n", formas3d.obterVolume());
            }
        }
    }
}
