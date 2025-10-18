/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.time.LocalDateTime;

/**
 *
 * @author USER
 */
public class Auditoria {
    private Long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataehora;
    private String ip;

    public Auditoria(Long id, Usuario usuario, String acao, LocalDateTime dataehora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataehora = dataehora;
        this.ip = ip;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataehora() {
        return dataehora;
    }

    public void setDataehora(LocalDateTime dataehora) {
        this.dataehora = dataehora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Auditoria{" + 
                "id=" + id + 
                ", usuario=" + usuario.getNome_usuario() + 
                ", acao=" + acao + 
                ", dataehora=" + dataehora + 
                ", ip=" + ip + 
                '}';
    }
    
    
}
