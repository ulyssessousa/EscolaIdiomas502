/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.escolaidiomas502.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ulyss
 */
public class Matricula {
    private int idMatricula;
    private int idAluno;
    private int idTurma;
    private Date dataMatricula;
    private String statusMatricula;

    public Matricula() {
    }

    public Matricula(int idMatricula, int idAluno, int idTurma, Date dataMatricula, String statusMatricula) {
        this.idMatricula = idMatricula;
        this.idAluno = idAluno;
        this.idTurma = idTurma;
        this.dataMatricula = dataMatricula;
        this.statusMatricula = statusMatricula;
    }

    
    public Matricula(int idAluno, int idTurma, Date dataMatricula, String statusMatricula) {
        this.idAluno = idAluno;
        this.idTurma = idTurma;
        this.dataMatricula = dataMatricula;
        this.statusMatricula = statusMatricula;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }
    
    public void cadastrarMatricula(Matricula matricula){
        
    }
    
    public void atualizarMatricula(Matricula matricula){
        
    }
    
    public void excluirMatricula(Matricula matricula){
        
    }
    
    public ArrayList<Matricula> consultarMatricula(int idMatricula){
        return null;
    }
}
