/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.modelos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author kiel
 */
public class AdmCadastro extends Pessoa implements Serializable{
    
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

    public AdmCadastro() {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.cargo);
        hash = 47 * hash + Objects.hashCode(this.nickname);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdmCadastro other = (AdmCadastro) obj;
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.senha, other.senha);
    }

    @Override
    public String toString() {
        return "AdmCadastro{" + "cargo=" + cargo + ", nickname=" + nickname 
                + ", email=" + email + ", senha=" + senha + '}';
    }
    
}
