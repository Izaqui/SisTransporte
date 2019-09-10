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
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String matricula;
    private LocalDate nascimento;

    public Pessoa(String nome, String cpf, String matricula, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nascimento = nascimento;
    }
    
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
}
