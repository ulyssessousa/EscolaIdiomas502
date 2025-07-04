/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.escolaidiomas502.controller;

/**
 *
 * @author ulyss
 */
public class IdiomaController {
    
    public boolean cadastrarIdioma(String nomeIdioma, String codigoISO){
        if(nomeIdioma != null && nomeIdioma.length()> 0 
                && codigoISO != null && codigoISO.length() > 0){
            
            return true;
        }
        return false;
    }
}
