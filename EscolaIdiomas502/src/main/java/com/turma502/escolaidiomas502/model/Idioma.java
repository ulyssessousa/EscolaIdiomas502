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
public class Idioma {
    private int idIdioma;
    private String nome;
    private String codigoISO;

    public Idioma(String nome, String codigoISO) {
        this.nome = nome;
        this.codigoISO = codigoISO;
    }

    public Idioma(int idIdioma, String nome, String codigoISO) {
        this.idIdioma = idIdioma;
        this.nome = nome;
        this.codigoISO = codigoISO;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoISO() {
        return codigoISO;
    }
    
    public void cadastrarIdioma(Idioma idioma){
        
    }
    
    public void atualizarIdioma(Idioma idioma){
        
    }
    
    public void excluirIdioma(Idioma idioma){
        
    }
    
    public ArrayList<Idioma> consultarIdioma(String nome){
        return null;
    }
}
