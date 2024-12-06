package com.automercado.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection conn = null;
    private static String login = "AUTOMERCADO";
    private static String clave = "auto123";
    private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    
    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, clave);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            } else {
                System.out.println("Conexión fallida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión erronea");
        }
        return conn;
    }
    
    public void desconexion() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar " + e.getMessage());
        }
    }
}
