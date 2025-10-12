/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author USER
 */
public class Conta {
    
    private static int proximoNumeroDaConta = 1;
    public int numeroDaConta;
    protected String tipo;
    private String proprietario;
    private double saldo;
    private boolean status = false;

    
    public Conta(String proprietario) {
        this.numeroDaConta = 0;
        this.tipo = null;
        this.proprietario = proprietario;
        this.saldo = 0.0;
        this.status = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    public void abrirConta(String tipo){
        this.numeroDaConta = proximoNumeroDaConta++;
        this.tipo = tipo;
        if(tipo.equalsIgnoreCase("cc")){
            this.saldo = 50.00;
        }else if(tipo.equalsIgnoreCase("cp")){
            this.saldo = 150.00;
        }else {
            System.out.println("Tipo Inválido");
            return;
        }
        this.status = true;
    }
    
    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Não é possível encerrar, dinheiro em conta!");
        }else if(this.saldo < 0){
            System.out.println("Não é possível encerrar, saldo negativado!");
        }else{
            status = false;
        }
    }
    
    public void depositar(double valorparadeposito){
        if(status){
            this.saldo += valorparadeposito;
        }else{
            System.out.println("Conta Inativa");
        }
    }
    
    public void sacar(double valorparasacar){
        if(status && saldo >= valorparasacar){
            this.saldo -= valorparasacar;
        }else{
            System.out.println("Conta Inativa ou Saldo inferior");
        }
    }
    
    public void mensalidade(){
        if(this.tipo.equals("cc")){
            this.saldo -= 12.0;
        }else if (this.tipo.equals("cp")){
            this.saldo -= 20.0;
        }
    }
}
