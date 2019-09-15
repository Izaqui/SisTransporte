/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.modelos;

import java.time.LocalDate;
import java.util.Objects;

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

    public Motorista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.rotas);
        hash = 29 * hash + this.quantMaximaAlunos;
        hash = 29 * hash + Objects.hashCode(this.horariosTrabalho);
        hash = 29 * hash + Objects.hashCode(this.Distrabalho);
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
        final Motorista other = (Motorista) obj;
        if (this.quantMaximaAlunos != other.quantMaximaAlunos) {
            return false;
        }
        if (!Objects.equals(this.rotas, other.rotas)) {
            return false;
        }
        if (!Objects.equals(this.horariosTrabalho, other.horariosTrabalho)) {
            return false;
        }
        if (!Objects.equals(this.Distrabalho, other.Distrabalho)) {
            return false;
        }
        return true;
    }
    
    
}
