/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.Dao;

import com.ifpb.sisTransp.interfaces.IdaoAluno;
import com.ifpb.sisTransp.modelos.Aluno;
import com.ifpb.sisTransp.modelos.Instituicao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiel
 */
public class DaoAluno implements IdaoAluno{
    
    private final File arquivo;
    public DaoAluno(){
    
        arquivo = new File("Aluno.bin");
        
        if (!arquivo.exists()) {
         
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro no arquivo");
            }
            
        }
        
    }
    
    @Override
    public boolean addAluno(Aluno aluno) throws IOException, ClassNotFoundException{
        
        List<Aluno> listaAluno;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAluno = (List<Aluno>) in.readObject();
        } else {
            listaAluno = new ArrayList<>();
        }
        
        for(Aluno a : listaAluno){
            if(a.getCpf().equals(aluno.getCpf())){
                return false;
            }
        }
        
       
        if (listaAluno.add(aluno)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaAluno);
            }
            
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean RemoveAluno(String cpf) throws IOException, ClassNotFoundException{
        
        List<Aluno> listaAluno;        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAluno = (List<Aluno>) in.readObject();
        } else {
            return false;
        }
        
        
        for(int i=0; i<listaAluno.size(); i++){
        
            if(listaAluno.get(i).getCpf().equals(cpf)){
                listaAluno.remove(i); 
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))) {
                    out.writeObject(listaAluno);
                }
                return true;
            }
            
        }
        return false;
    }

    public boolean atualizarAluno(String cpf, Aluno aluno) throws IOException, ClassNotFoundException{
        List<Aluno> listaAluno;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAluno = (List<Aluno>) in.readObject();
        } else {
            listaAluno = new ArrayList<>();
        }
        
        for(int i=0; i<listaAluno.size(); i++){
            if(listaAluno.get(i).getCpf().equals(cpf)){
                listaAluno.get(i).setContatoEmail(aluno.getContatoEmail());
                Instituicao instituicao = null;
                listaAluno.get(i).setInstituicao(instituicao);
                listaAluno.get(i).setContatoTelefone(aluno.getContatoTelefone());
                listaAluno.get(i).setNascimento(aluno.getNascimento());
                listaAluno.get(i).setNome(aluno.getNome());
                listaAluno.get(i).setCurso(aluno.getCurso());
                listaAluno.get(i).setCidadeInstituicao(aluno.getCidadeInstituicao());
                listaAluno.get(i).setHorarios(aluno.getHorarios());
                listaAluno.get(i).setMatricula(aluno.getMatricula());
                
                try (ObjectOutputStream out = new ObjectOutputStream(
                        new FileOutputStream(arquivo))) {
                    out.writeObject(listaAluno);
                }
                return true;
            }
        }
        
        return false;
    }

    @Override
    public Aluno buscarAlunoCpf(String cpf) throws IOException, ClassNotFoundException{
        for(Aluno a : listarAluno()){
            if(a.getCpf().equals(cpf))
                return a;
        }
        return null;
    }

    @Override
    public List<Aluno> listarAluno() throws IOException, ClassNotFoundException{
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            return (List<Aluno>) in.readObject();
        } else {
            return new ArrayList<>();
        }
    }

   // @Override
    //public boolean atualizarAluno(String cpf, Aluno aluno) throws IOException, ClassNotFoundException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}
