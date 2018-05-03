/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lima
 */
public class ModuloConexao {
    
    public static Connection conector(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3333/dbsistemavenda";
            con = DriverManager.getConnection(url,"root", "admin");
                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão com o Banco","Sistema De Venda", JOptionPane.ERROR_MESSAGE );
        }
        return con;
    }
    
    public static void FecharConexao(Connection con){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
}
