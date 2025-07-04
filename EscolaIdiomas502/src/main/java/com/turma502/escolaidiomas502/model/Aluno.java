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
public class Aluno {
    private int idAluno;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String telefone;

    public Aluno() {
    }

    public Aluno(int idAluno, String nome, Date dataNascimento, String email, String telefone) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public Aluno(String nome, Date dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void cadastrarAluno(Aluno aluno){
        
    }
    
    public void excluirAluno(Aluno aluno){
        
    }
    
    public void atualizarAluno(Aluno aluno){
        
    }
    
    public ArrayList<Aluno> consultarAluno(String nome){
        return null;
    }
}
