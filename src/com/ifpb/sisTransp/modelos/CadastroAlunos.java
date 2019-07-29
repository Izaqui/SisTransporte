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
public class CadastroAlunos extends Pessoa{
    
    private Instituicao instituicao;
    private String contatoEmail;
    private String contatoTelefone;
    private String curso;
    private String cidadeInstituicao;
    private String horarios;

    public CadastroAlunos(Instituicao instituicao, String contatoEmail, String contatoTelefone, String curso, String cidadeInstituicao, String horarios, String nome, String cpf, String matricula, LocalDate nascimento) {
        super(nome, cpf, matricula, nascimento);
        this.instituicao = instituicao;
        this.contatoEmail = contatoEmail;
        this.contatoTelefone = contatoTelefone;
        this.curso = curso;
        this.cidadeInstituicao = cidadeInstituicao;
        this.horarios = horarios;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public String getContatoEmail() {
        return contatoEmail;
    }

    public void setContatoEmail(String contatoEmail) {
        this.contatoEmail = contatoEmail;
    }

    public String getContatoTelefone() {
        return contatoTelefone;
    }

    public void setContatoTelefone(String contatoTelefone) {
        this.contatoTelefone = contatoTelefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCidadeInstituicao() {
        return cidadeInstituicao;
    }

    public void setCidadeInstituicao(String cidadeInstituicao) {
        this.cidadeInstituicao = cidadeInstituicao;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
    
    

}