/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.escolaidiomas502.controller;

import com.turma502.escolaidiomas502.dao.ExceptionDAO;
import com.turma502.escolaidiomas502.model.Idioma;
import java.util.ArrayList;

/**
 *
 * @author ulyss
 */
public class IdiomaController {
    
    public boolean cadastrarIdioma(String nomeIdioma, String codigoISO) throws ExceptionDAO{
        if(nomeIdioma != null && nomeIdioma.length()> 0 
                && codigoISO != null && codigoISO.length() > 0){
            
            Idioma idioma = new Idioma(nomeIdioma, codigoISO);
            
            new Idioma().cadastrarIdioma(idioma);
                    
            return true;
        }
        return false;
    }
    
    public ArrayList<Idioma> consultarIdiomas() throws ExceptionDAO{
        ArrayList<Idioma> idiomas = new Idioma().consultarIdioma();
        return idiomas;
    }
    
    public void excluirIdioma(int idIdioma) throws ExceptionDAO {
        new Idioma().excluirIdioma(idIdioma);
    }
}
