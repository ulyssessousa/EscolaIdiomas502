/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.escolaidiomas502.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author ulyss
 */
public class ConexaoBanco {
    
    public Connection getConnection() throws ExceptionDAO{
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/escolaidiomas";
            String usuario = "root";
            String senha = "1234";
            conn = DriverManager.getConnection(url, usuario, senha);
            
        }catch(ClassNotFoundException | SQLException e){
            throw new ExceptionDAO("Erro: " + e);
        }
        
        return conn;
    }
    
    public static void fecharPreparedStatement(PreparedStatement preparedStatement) throws ExceptionDAO{
        if(preparedStatement != null){
            try{
                preparedStatement.close();
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar preparedStatement: " + e);
            }
        }
    }
    
    public static void fecharConexao(Connection connection) throws ExceptionDAO{
        if(connection != null){
            try{
                connection.close();
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
}
