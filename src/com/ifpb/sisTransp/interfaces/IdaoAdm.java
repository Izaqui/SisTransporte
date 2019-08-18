/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.interfaces;

import com.ifpb.sisTransp.modelos.AdmCadastro;
import java.util.List;
import java.io.IOException;


/**
 *
 * @author kiel
 */
public interface IdaoAdm {
    public boolean addAdministrador(AdmCadastro adm)throws IOException, ClassNotFoundException;
    public boolean removeAdministrador(String email)throws IOException, ClassNotFoundException;
    public boolean atualizarAdministrador(String email, AdmCadastro adm)throws IOException, ClassNotFoundException;
    public AdmCadastro buscarAdministrador(String email)throws IOException, ClassNotFoundException;
    public List<AdmCadastro> listarAdministrador()throws IOException, ClassNotFoundException;
    
}
