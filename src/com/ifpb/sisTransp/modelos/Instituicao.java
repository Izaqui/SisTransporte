/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.modelos;

import java.util.Objects;

/**
 *
 * @author kiel
 */
public class Instituicao {
    
    private String nomeInstituicao;
    private String localidade;
    private String horariosFuncionamento;
    private TipoPP tipoPublicPrivate;

    public Instituicao(String nomeInstituicao, String localidade, String horariosFuncionamento, TipoPP tipoPublicPrivate) {
        this.nomeInstituicao = nomeInstituicao;
        this.localidade = localidade;
        this.horariosFuncionamento = horariosFuncionamento;
        this.tipoPublicPrivate = tipoPublicPrivate;
    }

   

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getHorariosFuncionamento() {
        return horariosFuncionamento;
    }

    public void setHorariosFuncionamento(String horariosFuncionamento) {
        this.horariosFuncionamento = horariosFuncionamento;
    }

    public TipoPP getTipoPublicPrivate() {
        return tipoPublicPrivate;
    }

    public void setTipoPublicPrivate(TipoPP tipoPublicPrivate) {
        this.tipoPublicPrivate = tipoPublicPrivate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nomeInstituicao);
        hash = 79 * hash + Objects.hashCode(this.localidade);
        hash = 79 * hash + Objects.hashCode(this.horariosFuncionamento);
        hash = 79 * hash + Objects.hashCode(this.tipoPublicPrivate);
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
        final Instituicao other = (Instituicao) obj;
        if (!Objects.equals(this.nomeInstituicao, other.nomeInstituicao)) {
            return false;
        }
        if (!Objects.equals(this.localidade, other.localidade)) {
            return false;
        }
        if (!Objects.equals(this.horariosFuncionamento, other.horariosFuncionamento)) {
            return false;
        }
        if (this.tipoPublicPrivate != other.tipoPublicPrivate) {
            return false;
        }
        return true;
    }
    
    
    
    
}
