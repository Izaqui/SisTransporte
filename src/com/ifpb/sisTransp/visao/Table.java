/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.sisTransp.visao;

import com.ifpb.sisTransp.Dao.DaoAluno;
import com.ifpb.sisTransp.modelos.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiel
 */
public class Table extends AbstractTableModel{
   
    private List<Aluno> alunoLista = new ArrayList<>();
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
                return alunoLista.get(linha).getNome();
            case 1:
                return alunoLista.get(linha).getCpf();
            case 2:
                return alunoLista.get(linha).getMatricula();
            case 3:
                return alunoLista.get(linha).getNascimento();
            case 4:
                return alunoLista.get(linha).getInstituicao();
            case 5:
                return alunoLista.get(linha).getCidadeInstituicao();
            case 6:
                return alunoLista.get(linha).getCurso();
            case 7:
                return alunoLista.get(linha).getContatoEmail();
            case 8:
                return alunoLista.get(linha).getContatoTelefone();
            case 9:
                return alunoLista.get(linha).getHorarios();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int lin, int col) {
        
            return false;
        
    }
    
   public void addRow(Aluno a){
   
       this.alunoLista.add(a);
       this.fireTableDataChanged();
       
   } 
   
   public void addList(List<Aluno> lista){
   
       this.alunoLista = lista;
       this.fireTableDataChanged();
   }

    
}
