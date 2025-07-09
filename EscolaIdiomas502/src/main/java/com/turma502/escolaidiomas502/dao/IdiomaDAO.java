/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.escolaidiomas502.dao;

import com.turma502.escolaidiomas502.model.Idioma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ulyss
 */
public class IdiomaDAO {
    
    public void cadastrarIdioma(Idioma idioma) throws ExceptionDAO{
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       
       try{
           String strSQL = "insert into idioma (nome, codigoiso)"
                            + " value (?,?);";
           connection = new ConexaoBanco().getConnection();
           preparedStatement = connection.prepareStatement(strSQL);
           preparedStatement.setString(1, idioma.getNome());
           preparedStatement.setString(2, idioma.getCodigoISO());
           preparedStatement.execute();
           
       }catch(SQLException e){
           throw new ExceptionDAO("Erro ao tentar cadastrar idioma: " + e);
       }finally{
           if(preparedStatement != null){
               try{
                   preparedStatement.close();
               }catch(SQLException e){
                   throw new ExceptionDAO("Erro ao fechar preparedStatement: " + e);
               }
           }
           if(connection != null){
               try{
                   connection.close();
               }catch(SQLException e){
                   throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
               }
           }
       }
    }
}
