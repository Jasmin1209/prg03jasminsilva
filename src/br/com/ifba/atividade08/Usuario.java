/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
/**
 *
 * @author USER
 */
public class Usuario {
    
    private Long id;
    private PerfilUsuario perfil;
    private String nome_usuario;
    private String email;
    private String senha;
    private LocalDateTime ultimologin;
    private boolean status;
    
    private List<Auditoria> auditoria = new ArrayList<>(); 
    private List<Sessao> sessao = new ArrayList<>();

    public Usuario(PerfilUsuario perfil, String nome_usuario, String email, String senha) {
        this.id = (long) (Math.random() * 100); //gerando ID automaticamente
        this.perfil = perfil;
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.senha = senha;
        this.status = false;
    }

    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimologin() {
        return ultimologin;
    }

    public void setUltimologin(LocalDateTime ultimologin) {
        this.ultimologin = ultimologin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Auditoria> getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(List<Auditoria> auditoria) {
        this.auditoria = auditoria;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

    
    public boolean login (String usuario, String senha ){
        if(this.nome_usuario.equals(usuario)){ //verificação de usuário e senha
            if(this.senha.equals(senha)){
                this.ultimologin = LocalDateTime.now();
                Auditoria log = new Auditoria(
                (long)(Math.random() * 10000),
                this, 
                "Login Efetuado",
                LocalDateTime.now(),
                "192.162.0.2"
                );
                auditoria.add(log); //adiciona os atributos de auditoria para uma lista
                this.status = true;
                return true;
            }else {
                Auditoria log = new Auditoria(
                (long)(Math.random() * 10000),
                this, 
                "Tentativa de Login ",
                LocalDateTime.now(),
                "192.162.0.2"
                );
            auditoria.add(log);
            return false;
        }
        } else {
            return false;
        }
    }
    
    public Sessao criarSessao() {
        Sessao s = new Sessao((long) (Math.random() * 1000), this, UUID.randomUUID().toString());
        sessao.add(s);
        return s;
    }

    @Override
    public String toString() {
        return "Usuario{" + 
                "id=" + id + 
                ", perfil=" + perfil + 
                ", nome_usuario=" + nome_usuario + 
                ", email=" + email + 
                ", senha=" + senha + 
                ", ultimologin=" + ultimologin + 
                ", status=" + (status ? "ativo" : "desativado") + '}';
    }
    
     
}
