/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.modelos;

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
    
    
    
}
