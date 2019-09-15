/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.Dao;

import com.ifpb.sisTransp.interfaces.IdaoInstituicao;
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
public class DaoInstituicao implements IdaoInstituicao{
    
    private final File arquivo;
    
    Instituicao instituicao;
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

    @Override
    public boolean addInstituicao(Instituicao instituicao) throws IOException, ClassNotFoundException{
           List<Instituicao> listaInstituicao = null;        
           
           if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaInstituicao = (List<Instituicao>) in.readObject();
        } else {
            listaInstituicao = new ArrayList<>();
        }
        
        for(Instituicao i : listaInstituicao){
            if(i.getNomeInstituicao().equals(nome))){
                return false;
            }
        }
        
       
        if (listaInstituicao.add(instituicao)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaInstituicao);
            }
            
            return true;

        } else {
            return false;
        }
    }

    public boolean removeAdministrador(String nome) throws IOException, ClassNotFoundException {
        List<Instituicao> listaInstituicao;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaInstituicao = (List<Instituicao>) in.readObject();
        } else {
            return false;
        }
        
        
        for(int i=0; i<listaInstituicao.size(); i++){
        
            if(listaInstituicao.get(i).getNomeInstituicao().equals(nome){
                listaInstituicao.remove(i); 
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))) {
                    out.writeObject(listaInstituicao);
                }
                return true;
            }
            
        }
        return false;
    }

    public boolean atualizarAdministrador(String nome, Instituicao instituicao) throws IOException, ClassNotFoundException {
        List<Instituicao> listaInstituicao;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaInstituicao = (List<Instituicao>) in.readObject();
        } else {
            listaInstituicao = new ArrayList<>();
        }
        
        for(Instituicao i : listaInstituicao){
            if(i.getNomeInstituicao().equals(nome){
                i.setNomeInstituicao(instituicao.getNomeInstituicao());
                i.setLocalidade(instituicao.getLocalidade());
                i.setHorariosFuncionamento(instituicao.getLocalidade());
                i.setTipoPublicPrivate(instituicao.getTipoPublicPrivate());
                return true;
            }
        }
        
        return false;
    }

    public Instituicao buscarAInstituicao(String nome) throws IOException, ClassNotFoundException {
     for(Instituicao i : listarInstituicao()){
         System.out.println(i.getNomeInstituicao());
            if(i.getNomeInstituicao().equals(nome))
                return i;
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

    @Override
    public boolean removeInstituicao(String nome) throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizarInstituicao(String nome, Instituicao instituicao) throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Instituicao buscarInstituicao(String nome) throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Instituicao> listarInstituicao() throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
