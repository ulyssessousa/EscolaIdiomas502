/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.escolaidiomas502.dao;

import com.turma502.escolaidiomas502.model.Idioma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
           if (connection != null){
                preparedStatement = connection.prepareStatement(strSQL);
                preparedStatement.setString(1, idioma.getNome());
                preparedStatement.setString(2, idioma.getCodigoISO());
                preparedStatement.execute();
           }
       }catch(SQLException e){
           throw new ExceptionDAO("Erro ao tentar cadastrar idioma: " + e);
       }finally{
           ConexaoBanco.fecharPreparedStatement(preparedStatement);
           ConexaoBanco.fecharConexao(connection);
           
       }
       
       
    }
    
    public ArrayList<Idioma> consultarIdiomas() 
                                     throws ExceptionDAO{
        ArrayList<Idioma> idiomas = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try{
            String strSQL = "select * from idioma;";
            connection = new ConexaoBanco().getConnection();
            if (connection != null){
                preparedStatement = connection.prepareStatement(strSQL);
                resultSet = preparedStatement.executeQuery();
                idiomas = new ArrayList<>();
                while(resultSet.next()){
                    int idIdioma = resultSet.getInt("ididioma");
                    String nomeIdioma = resultSet.getString("nome");
                    String codigoISO = resultSet.getString("codigoiso");
                    Idioma idiomaAtual = new Idioma(idIdioma, 
                                                    nomeIdioma, 
                                                    codigoISO);
                    idiomas.add(idiomaAtual);
                }
            }
        }catch(SQLException e){
            throw new ExceptionDAO("Erro na consulta:" + e);
        }finally{
           ConexaoBanco.fecharPreparedStatement(preparedStatement);
           ConexaoBanco.fecharConexao(connection);            
        }
        return idiomas;
    }
    
    public void excluirIdioma(int idIdioma) throws ExceptionDAO{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            String strSQL = "delete from idioma where ididioma = ?;";
            connection = new ConexaoBanco().getConnection();
            if (connection != null){
                preparedStatement = connection.prepareStatement(strSQL);
                preparedStatement.setInt(1, idIdioma);
                preparedStatement.execute();
                
            }
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao excluir idioma: " + e);
        }finally{
            ConexaoBanco.fecharPreparedStatement(preparedStatement);
            ConexaoBanco.fecharConexao(connection);
        }
    }
    
    public void editarIdioma(Idioma idioma) throws ExceptionDAO{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            String strSQL = "update idioma set ";
            strSQL += " nome = ?, codigoISO = ? ";
            strSQL += " where ididioma = ?;";
            connection = new ConexaoBanco().getConnection();
            preparedStatement = connection.prepareStatement(strSQL);
            preparedStatement.setString(1, idioma.getNome());
            preparedStatement.setString(2, idioma.getCodigoISO());
            preparedStatement.setInt(3, idioma.getIdIdioma());
            preparedStatement.execute();
           
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao atulizar idioma: " + e);
        }finally{
            ConexaoBanco.fecharPreparedStatement(preparedStatement);
            ConexaoBanco.fecharConexao(connection);
        }
    }
    
}
