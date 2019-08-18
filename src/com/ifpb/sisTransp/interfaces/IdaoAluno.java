/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.interfaces;

import com.ifpb.sisTransp.modelos.CadastroAlunos;
import java.util.List;
import java.io.IOException;

/**
 *
 * @author kiel
 */
public interface IdaoAluno {
    
    public boolean addAluno(CadastroAlunos aluno) throws IOException, ClassNotFoundException;
    public boolean RemoveAluno(String cpf)throws IOException, ClassNotFoundException;
    public boolean atualizarAluno(String cpf, CadastroAlunos aluno)throws IOException, ClassNotFoundException;
    public CadastroAlunos buscarAlunoCpf(String cpf)throws IOException, ClassNotFoundException;
    public List<CadastroAlunos> listarAluno()throws IOException, ClassNotFoundException;
    
    
}
