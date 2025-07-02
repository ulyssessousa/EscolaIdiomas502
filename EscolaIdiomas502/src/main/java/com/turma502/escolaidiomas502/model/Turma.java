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
public class Turma {
    private int idTurma;
    private int idIdioma;
    private int idProfessor;
    private String nivel;
    private String horario;
    private Date dataInicio;
    private Date dataFim;
    private int capacidadeMaxima;

    public Turma(int idIdioma, int idProfessor, String nivel, String horario, Date dataInicio, Date dataFim, int capacidadeMaxima) {
        this.idIdioma = idIdioma;
        this.idProfessor = idProfessor;
        this.nivel = nivel;
        this.horario = horario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public String getNivel() {
        return nivel;
    }

    public String getHorario() {
        return horario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    
    public void cadastrarTurma(Turma turma){
        
    }
    
    public void atualizarTurma(Turma turma){
        
    }
    
    public void excluirTurma(Turma turma){
        
    }
    
    public ArrayList<Turma> consultarTurma(){
        return null;
    }
    
}
