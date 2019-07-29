/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.modelos;

import java.time.LocalDate;

/**
 *
 * @author kiel
 */
public class AdmCadastro extends Pessoa{
    
    private String cargo;
    private String nickname;
    private String email;
    private String senha;

    public AdmCadastro(String cargo, String nickname, String email, String senha, String nome, String cpf, String matricula, LocalDate nascimento) {
        super(nome, cpf, matricula, nascimento);
        this.cargo = cargo;
        this.nickname = nickname;
        this.email = email;
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
    
    
    
}
