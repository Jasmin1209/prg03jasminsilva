/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            //CRIAR PERFIS E SUAS PERMISSÕES
            String nome_perfil;
            System.out.println("Informe o nome do perfil: ");
            nome_perfil = sc.nextLine();
            PerfilUsuario perfil1 = new PerfilUsuario(nome_perfil);
                   
            //CRIAR USUÁRIO    
            System.out.println("Informe seu username: ");
            String username = sc.nextLine();
            System.out.println("Informe seu email: ");
            String emailInserido = sc.nextLine();
            System.out.print("Informe sua senha: ");
            String senhaInserida = sc.nextLine();
            Usuario usuario1 = new Usuario(perfil1, username, emailInserido, senhaInserida);
            
            //FAZER LOGIN
            System.out.println("------ LOGIN -------");
            System.out.println("USUÁRIO: ");
            String usuario = sc.nextLine();
            System.out.println("SENHA: ");
            String senha = sc.nextLine();
            if(usuario1.login(usuario, senha)){
                System.out.println("Login Efetuado");
            } else {
                System.out.println("Senha ou Usuário incorretos");
            }
                    
            //LISTAR AUDITORIAS    
            for(Auditoria log : usuario1.getAuditoria()){
                System.out.println(log);
            }
            
           //SESSÃO
           Sessao s1 = usuario1.criarSessao();
           System.out.println(s1);
    }
}

