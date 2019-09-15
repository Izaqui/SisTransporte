/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.Dao;

import com.ifpb.sisTransp.interfaces.IdaoMotorista;
import com.ifpb.sisTransp.modelos.Motorista;
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
public class DaoMotorista implements IdaoMotorista{
    
    private final File arquivo;
    
    Motorista motorista;
    public DaoMotorista(){
        arquivo = new File("motorista.bin");
        if(!arquivo.exists()){
            
            try{
                arquivo.createNewFile();
            }catch (IOException ex){
                System.out.println("Erro no Arquivo");
            }
        }
    }
    @Override
    public boolean addMotorista(Motorista motorista)throws IOException, ClassNotFoundException{
           List<Motorista> listaMotorista = null;        
           
           if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaMotorista = (List<Motorista>) in.readObject();
        } else {
            listaMotorista = new ArrayList<>();
        }
        
        for(Motorista m : listaMotorista){
            if(m.getCpf().equals(motorista.getCpf())){
                return false;
            }
        }
        
       
        if (listaMotorista.add(motorista)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaMotorista);
            }
            
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean removeMotorista(String nome) throws IOException, ClassNotFoundException {
        List<Motorista> listaMotorista;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaMotorista = (List<Motorista>) in.readObject();
        } else {
            return false;
        }
        
        
        for(int i=0; i<listaMotorista.size(); i++){
        
            if(listaMotorista.get(i).getNome().equals(nome)){
                listaMotorista.remove(i); 
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(listaMotorista);
                out.close();
                return true;
            }
            
        }
        return false;
    }

    public boolean atualizarAdministrador(String nome, Motorista motorista) throws IOException, ClassNotFoundException {
        List<Motorista> listaMotorista;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaMotorista = (List<Motorista>) in.readObject();
        } else {
            listaMotorista = new ArrayList<>();
        }
        
        for(Motorista m : listaMotorista){
            if(m.getCpf().equals(m)){
                m.setNome(motorista.getNome());
                m.setCpf(motorista.getCpf());
                m.setNascimento(motorista.getNascimento());
                m.setMatricula(motorista.getMatricula());
                m.setRotas(motorista.getRotas());
                m.setQuantMaximaAlunos(motorista.getQuantMaximaAlunos());
                m.setDistrabalho(motorista.getDistrabalho());
                m.setHorariosTrabalho(motorista.getHorariosTrabalho());
                return true;
            }
        }
        
        return false;
    }

    @Override
    public Motorista buscarMotorista(String cpf) throws IOException, ClassNotFoundException {
     for(Motorista m : listarMotorista()){
         System.out.println(m.getCpf());
            if(m.getCpf().equals(cpf))
                return m;
        }
        return null;   
    }

    public List<Motorista> listarAdministrador() throws IOException, ClassNotFoundException {
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            return (List<Motorista>) in.readObject();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public boolean atualizarMotorista(String cpf, Motorista motorista) throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Motorista> listarMotorista() throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
