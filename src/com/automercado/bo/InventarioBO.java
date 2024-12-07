package com.automercado.bo;

import com.automercado.dao.InventarioDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.Inventario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class InventarioBO {
    
    private String mensaje = "";
    private InventarioDAO invdao = new InventarioDAO();

    public String agregarInventario(Inventario inv) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = invdao.agregarInventario(conn, inv);
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

    public String modificarInventario(Inventario inv) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = invdao.modificarInventario(conn, inv);
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

    public String eliminarInventario(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = invdao.eliminarInventario(conn, id);
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
    
    public void listaInventario(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            invdao.listaInventario(conn, tabla);
        } catch (Exception e) {
            System.out.println("Error al listar ventas: " + e.getMessage());
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
