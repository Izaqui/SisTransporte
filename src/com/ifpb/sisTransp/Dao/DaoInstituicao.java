/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.Dao;

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
public class DaoInstituicao {
    
    private final File arquivo;
    
    Instituicao isntituicao;
    public DaoInstituicao(){
    
        arquivo = new File("Instituicao.bin");
        
        if (!arquivo.exists()) {
         
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro no arquivo");
            }
            
        }
        
    }

    public boolean addNome(Instituicao inst) throws IOException, ClassNotFoundException{
           List<Instituicao> listaInst = null;        
           
           if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaInst = (List<Instituicao>) in.readObject();
        } else {
            listaInst = new ArrayList<>();
        }
        
        for(Instituicao a : listaInst){
            if(a.getNomeInstituicao().equals(inst.getNomeInstituicao())){
                return false;
            }
        }
        
       
        if (listaInst.add(inst)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaInst);
            }
            
            return true;

        } else {
            return false;
        }
    }

    public boolean removeInstituicao(String email) throws IOException, ClassNotFoundException {
        List<Instituicao> listaInst;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaInst = (List<Instituicao>) in.readObject();
        } else {
            return false;
        }
        
        
        for(int i=0; i<listaInst.size(); i++){
        
            if(listaInst.get(i).getNomeInstituicao().equals(nomeInstituicao)){
                listaInst.remove(i); 
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(listaInst);
                out.close();
                return true;
            }
            
        }
        return false;
    }

    public boolean atualizarAdministrador(String email, Instituicao inst) throws IOException, ClassNotFoundException {
        List<Instituicao> listaAdm;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAdm = (List<Instituicao>) in.readObject();
        } else {
            listaAdm = new ArrayList<>();
        }
        
        for(Instituicao a : listaAdm){
            if(a.getNomeInstituicao().equals(nomeInstituicao)){
                a.setNomeInstituicao(inst.getNomeInstituicao());
                a.setLocalidade(inst.getLocalidade());
                a.setHorariosFuncionamento(inst.getHorariosFuncionamento());
                
                return true;
            }
        }
        
        return false;
    }

    public Instituicao buscarAdministrador(String email) throws IOException, ClassNotFoundException {
     for(Instituicao a : listarAdministrador()){
            if(a.getNomeInstituicao().equals(nomeInstituicao))
                return a;
        }
        return null;   
    }

    public List<Instituicao> listarAdministrador() throws IOException, ClassNotFoundException {
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            return (List<Instituicao>) in.readObject();
        } else {
            return new ArrayList<>();
        }
    }
}
