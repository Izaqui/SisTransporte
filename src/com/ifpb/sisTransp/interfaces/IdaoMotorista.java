/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.interfaces;

import com.ifpb.sisTransp.modelos.Motorista;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author kiel
 */
public interface IdaoMotorista {
    
    public boolean addMotorista(Motorista motorista)throws IOException, ClassNotFoundException;
    public boolean removeMotorista(String cpf)throws IOException, ClassNotFoundException;
    public boolean atualizarMotorista(String cpf, Motorista motorista)throws IOException, ClassNotFoundException;
    public Motorista buscarMotorista(String cpf)throws IOException, ClassNotFoundException;
    public List<Motorista> listarMotorista()throws IOException, ClassNotFoundException;
    
}
