/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.Dao;

import com.ifpb.sisTransp.interfaces.IdaoAdm;
import com.ifpb.sisTransp.modelos.AdmCadastro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kiel
 */
public class DaoAdm implements IdaoAdm{
    
    private final File arquivo;
    
    private AdmCadastro administrador;
    public DaoAdm(){
    
        arquivo = new File("Adm.txt");
        
        if (!arquivo.exists()) {
         
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro no arquivo");
            }
            
        }
        
    }

    @Override
    public boolean addAdministrador(AdmCadastro adm) throws IOException, ClassNotFoundException{
           List<AdmCadastro> listaAdministrador = null;        
           
           if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAdministrador = (List<AdmCadastro>) in.readObject();
        } else {
            listaAdministrador = new ArrayList<>();
        }
        
        for(AdmCadastro a : listaAdministrador){
            if(a.getEmail().equals(adm.getEmail())){
                return false;
            }
        }
        
        if (listaAdministrador.add(adm)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaAdministrador);
            }
            
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean removeAdministrador(String email) throws IOException, ClassNotFoundException {
        List<AdmCadastro> listaAdm;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAdm = (List<AdmCadastro>) in.readObject();
        } else {
            return false;
        }
        
        
        for(int i=0; i<listaAdm.size(); i++){
        
            if(listaAdm.get(i).getEmail().equals(email)){
                listaAdm.remove(i); 
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(listaAdm);
                out.close();
                return true;
            }
            
        }
        return false;
    }

    @Override
    public boolean atualizarAdministrador(String email, AdmCadastro adm) throws IOException, ClassNotFoundException {
        List<AdmCadastro> listaAdm;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAdm = (List<AdmCadastro>) in.readObject();
        } else {
            listaAdm = new ArrayList<>();
        }
        
        for(AdmCadastro a : listaAdm){
            if(a.getEmail().equals(email)){
                a.setEmail(adm.getEmail());
                a.setNome(adm.getNome());
                a.setSenha(adm.getSenha());
                return true;
            }
        }
        
        return false;
    }

    @Override
    public AdmCadastro buscarAdministrador(String email, String senha) throws IOException, ClassNotFoundException {
     for(AdmCadastro a : listarAdministrador()){
            if((a.getEmail().equals(email)) && (a.getSenha()).equals(senha))
                return a;
        }
        return null;   
    }

    @Override
    public List<AdmCadastro> listarAdministrador() throws IOException, ClassNotFoundException {
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));
            return (List<AdmCadastro>) in.readObject();
        } else {
            return Collections.emptyList();
        }
    }
    
    
}
