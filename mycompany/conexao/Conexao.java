/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexao;

import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Conexao {

    public static void main(String[] args) throws SQLException {
        Teste t1 = new Teste();
        t1.alterar("miguel");
        t1.ver();
    }
}
