/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.modelos;

import static com.ifpb.sisTransp.modelos.TipoPP.PUBLICA;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author kiel
 */
public class CadastroAlunos extends Pessoa{
    
    private TipoPP instituicao;
    private String contatoEmail;
    private String contatoTelefone;
    private String curso;
    private String cidadeInstituicao;
    private String horarios;

    public CadastroAlunos(TipoPP instituicao, String contatoEmail, String contatoTelefone, String curso, String cidadeInstituicao, String horarios, String nome, String cpf, String matricula, LocalDate nascimento) {
        super(nome, cpf, matricula, nascimento);
        this.instituicao=null;
        this.contatoEmail = contatoEmail;
        this.contatoTelefone = contatoTelefone;
        this.curso = curso;
        this.cidadeInstituicao = cidadeInstituicao;
        this.horarios = horarios;
    }

    public TipoPP getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao=null;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.instituicao);
        hash = 17 * hash + Objects.hashCode(this.contatoEmail);
        hash = 17 * hash + Objects.hashCode(this.contatoTelefone);
        hash = 17 * hash + Objects.hashCode(this.curso);
        hash = 17 * hash + Objects.hashCode(this.cidadeInstituicao);
        hash = 17 * hash + Objects.hashCode(this.horarios);
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
        final CadastroAlunos other = (CadastroAlunos) obj;
        if (!Objects.equals(this.contatoEmail, other.contatoEmail)) {
            return false;
        }
        if (!Objects.equals(this.contatoTelefone, other.contatoTelefone)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.cidadeInstituicao, other.cidadeInstituicao)) {
            return false;
        }
        if (!Objects.equals(this.horarios, other.horarios)) {
            return false;
        }
        return Objects.equals(this.instituicao, other.instituicao);
    }
    
    

}