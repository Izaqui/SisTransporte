/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.interfaces;

import com.ifpb.sisTransp.modelos.Instituicao;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author kiel
 */
public interface IdaoInstituicao {
    
    public boolean addInstituicao(Instituicao instituicao)throws IOException, ClassNotFoundException;
    public boolean removeInstituicao(String nome)throws IOException, ClassNotFoundException;
    public boolean atualizarInstituicao(String nome, Instituicao instituicao)throws IOException, ClassNotFoundException;
    public Instituicao buscarInstituicao(String nome)throws IOException, ClassNotFoundException;
    public List<Instituicao> listarInstituicao()throws IOException, ClassNotFoundException;
    
}
