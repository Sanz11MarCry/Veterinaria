/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AbelSanz
 */
public class conectar {
    Connection con = null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Veterinaria","root","");
            System.out.println("conexion establecida");
            JOptionPane.showMessageDialog(null, "conexion establecida");
            
        } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion");
            
        }
        return con;
    }
}

    

