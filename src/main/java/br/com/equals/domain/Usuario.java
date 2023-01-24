package br.com.equals.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private LocalDateTime dataUltLogin;
    private String ipUltAcesso;
    private String senha;
    private Boolean ativo;
    private Boolean retaguarda;
    private LocalDate dataSenha;
    private Integer numeroTentativa;
    private Boolean senhaBloqueada;
    private String sexo;
    private Character tutorial;
    private LocalDate dataCadastro;
    private LocalDate dataTombamento;
    private String statusTombamento;
    private String numeroTelefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDataUltLogin() {
        return dataUltLogin;
    }

    public void setDataUltLogin(LocalDateTime dataUltLogin) {
        this.dataUltLogin = dataUltLogin;
    }

    public String getIpUltAcesso() {
        return ipUltAcesso;
    }

    public void setIpUltAcesso(String ipUltAcesso) {
        this.ipUltAcesso = ipUltAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getRetaguarda() {
        return retaguarda;
    }

    public void setRetaguarda(Boolean retaguarda) {
        this.retaguarda = retaguarda;
    }

    public LocalDate getDataSenha() {
        return dataSenha;
    }

    public void setDataSenha(LocalDate dataSenha) {
        this.dataSenha = dataSenha;
    }

    public Integer getNumeroTentativa() {
        return numeroTentativa;
    }

    public void setNumeroTentativa(Integer numeroTentativa) {
        this.numeroTentativa = numeroTentativa;
    }

    public Boolean getSenhaBloqueada() {
        return senhaBloqueada;
    }

    public void setSenhaBloqueada(Boolean senhaBloqueada) {
        this.senhaBloqueada = senhaBloqueada;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Character getTutorial() {
        return tutorial;
    }

    public void setTutorial(Character tutorial) {
        this.tutorial = tutorial;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataTombamento() {
        return dataTombamento;
    }

    public void setDataTombamento(LocalDate dataTombamento) {
        this.dataTombamento = dataTombamento;
    }

    public String getStatusTombamento() {
        return statusTombamento;
    }

    public void setStatusTombamento(String statusTombamento) {
        this.statusTombamento = statusTombamento;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
