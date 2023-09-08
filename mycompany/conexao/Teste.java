/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class Teste extends Conn{
    public void ver() throws SQLException{
        Connection conexaoz = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexaoz = DriverManager.getConnection("jdbc:mysql://localhost/bancoteste", "root", "");
            ResultSet rs = conexaoz.createStatement().executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                System.out.println("Nome:"+rs.getString("nome"));
            }
        } catch (ClassNotFoundException ex) {
                System.out.println("Driver do Banco de Dados não encontrado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco:" + ex.getMessage());
        } finally{
            if (conexaoz != null) {
                conexaoz.close();
            }
        
        }
    }
    
    
    public void alterar(String p) throws SQLException{
        Connection conexaoz = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexaoz = DriverManager.getConnection("jdbc:mysql://localhost/bancoteste", "root", "");
            String sql = "INSERT INTO cliente (nome) VALUES ('" + p + "')";
            Statement statement = conexaoz.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
                System.out.println("Driver do Banco de Dados não encontrado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco:" + ex.getMessage());
        } finally{
            if (conexaoz != null) {
                conexaoz.close();
            }
        
        }
    }
}
