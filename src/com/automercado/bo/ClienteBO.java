package com.automercado.bo;

import com.automercado.dao.ClienteDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class ClienteBO {

    private String mensaje = "";
    private ClienteDAO cdao = new ClienteDAO();

    public String agregarCliente(Cliente cli) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.agregarCliente(conn, cli);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje += " Error al cerrar la conexión: " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String modificarCliente(Cliente cli) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.modificarCliente(conn, cli);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje += " Error al cerrar la conexión: " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String eliminarCliente(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.eliminarCliente(conn, id);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje += " Error al cerrar la conexión: " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listaCliente(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            cdao.listaCliente(conn, tabla);
        } catch (Exception e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
}