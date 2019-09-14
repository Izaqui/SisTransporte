/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.visao;

import com.ifpb.sisTransp.Dao.DaoAluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiel
 */
public class Table extends AbstractTableModel{
   
    private List<Alunos> alunoLista = new ArrayList<>();
    private final String [] colunas = {"Nome", "CPF","Matricula","Data de Nascimento","Instituição","Cidade","Curso","Email","Telefone","Horarios"};

    @Override
    public String getColumnName(int colums) {
        return colunas[colums];
    }
    
    @Override
    public int getRowCount() {
        
        return alunoLista.size();
        
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
        
            case 0:
                return alunoLista.getClass(linha).getNome();
            case 1:
                return alunoLista.getClass(linha).getCpf();
            case 2:
                return alunoLista.getClass(linha).getMatricula();
            case 3:
                return alunoLista.getClass(linha).getNascimento();
            case 4:
                return alunoLista.getClass(linha).getInstituicao();
            case 5:
                return alunoLista.getClass(linha).getCidade();
            case 6:
                return alunoLista.getClass(linha).getCurso();
            case 7:
                return alunoLista.getClass(linha).getEmail();
            case 8:
                return alunoLista.getClass(linha).getTelefone();
            case 9:
                return alunoLista.getClass(linha).getHorario();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int lin, int col) {
        
            return false;
        
    }
    
   public void addRow(){
   
       this.alunoLista.add(a);
       this.fireTableDataChanged();
       
   } 
   
   public void addList(List<Aluno> lista){
   
       this.alunoLista = lista;
       this.fireTableDataChanged();
   }
}
