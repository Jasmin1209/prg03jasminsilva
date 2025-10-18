/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PerfilUsuario {
    private Long id;
    private String descricao;
    private List<String> permissoes;

    public PerfilUsuario(String descricao) {
        this.id = (long) (Math.random()*100); //número ID será gerado automaticamente
        this.descricao = descricao;
        this.permissoes = new ArrayList<>();
        criarPermissoes();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricoes() {
        return descricao;
    }

    public void setDescricoes(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    private void criarPermissoes(){
        Scanner sc = new Scanner(System.in);
        String continuar;
        do{ 
        System.out.println("Informe a permissão: ");
        String descricao_das_permissoes = sc.nextLine();
        permissoes.add(descricao_das_permissoes);
            System.out.println("Deseja continuar? (sim/nao)");
            continuar = sc.nextLine();
        }while(continuar.equals("sim"));
        System.out.println("Permissões criadas");
    }
    
    @Override
    public String toString() {
        return "PerfilUsuario{" + "id=" + id 
                + ", descricoes=" + descricao 
                + ", permissoes=" + permissoes 
                + '}';
    }
    
    
}
