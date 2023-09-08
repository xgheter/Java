/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Conn {
    public static void main(String[] args) throws SQLException {
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
}
