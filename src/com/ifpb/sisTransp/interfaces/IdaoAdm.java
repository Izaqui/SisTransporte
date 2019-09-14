/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.interfaces;

import com.ifpb.sisTransp.modelos.Administrador;
import java.util.List;
import java.io.IOException;


/**
 *
 * @author kiel
 */
public interface IdaoAdm {
    public boolean addAdministrador(Administrador adm)throws IOException, ClassNotFoundException;
    public boolean removeAdministrador(String email)throws IOException, ClassNotFoundException;
    public boolean atualizarAdministrador(String email, Administrador adm)throws IOException, ClassNotFoundException;
    public Administrador buscarAdministrador(String email, String senha)throws IOException, ClassNotFoundException;
    public List<Administrador> listarAdministrador()throws IOException, ClassNotFoundException;
    
}
