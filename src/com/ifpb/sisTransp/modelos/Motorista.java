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
public class Motorista extends Pessoa{
    private String rotas;
    private int quantMaximaAlunos;
    private String horariosTrabalho;
    private String Distrabalho;

    public Motorista(String rotas, int quantMaximaAlunos, String horariosTrabalho, String Distrabalho, String nome, String cpf, String matricula, LocalDate nascimento) {
        super(nome, cpf, matricula, nascimento);
        this.rotas = rotas;
        this.quantMaximaAlunos = quantMaximaAlunos;
        this.horariosTrabalho = horariosTrabalho;
        this.Distrabalho = Distrabalho;
    }
    

    public String getRotas() {
        return rotas;
    }

    public void setRotas(String rotas) {
        this.rotas = rotas;
    }

    public int getQuantMaximaAlunos() {
        return quantMaximaAlunos;
    }

    public void setQuantMaximaAlunos(int quantMaximaAlunos) {
        this.quantMaximaAlunos = quantMaximaAlunos;
    }

    public String getHorariosTrabalho() {
        return horariosTrabalho;
    }

    public void setHorariosTrabalho(String horariosTrabalho) {
        this.horariosTrabalho = horariosTrabalho;
    }

    public String getDistrabalho() {
        return Distrabalho;
    }

    public void setDistrabalho(String Distrabalho) {
        this.Distrabalho = Distrabalho;
    }
    
    
}
