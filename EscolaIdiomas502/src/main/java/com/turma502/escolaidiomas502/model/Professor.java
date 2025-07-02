/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.escolaidiomas502.model;

import java.util.ArrayList;

/**
 *
 * @author ulyss
 */
public class Professor {
    private int idProfessor;
    private String nome;
    private String email;
    private String telefone;

    public Professor(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void cadastrarProfessor(Professor professor){
        
    }
    
    public void excluirProfessor(Professor professor){
        
    }
    
    public void atualizarProfessor(Professor professor){
        
    }
    
    public ArrayList<Professor> consultarProfessor(String nome){
        return null;
    }
}
