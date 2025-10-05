/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author USER
 */
public class Fatorial {
    private int resultado = 1;
    private String formula = "";
    
    public void setValor(int numeroParaFatorar){
        int valor_total = 1;
        String formulaEmConstrucao = " ";
        for(int i = numeroParaFatorar; i > 1; i--){
            valor_total *= i; //realiza a multiplicação dos números
            formulaEmConstrucao += i + " X "; //concatena todos os números em uma string, formando a fórmula
        }
        formulaEmConstrucao += "1 = "; //Como o número 1 não precisa ser multiplicado, aparecerá no final da fórmula como '1 ='
        resultado = valor_total;
        formula = formulaEmConstrucao;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public String getFormula(){
        return formula;
    }
}
