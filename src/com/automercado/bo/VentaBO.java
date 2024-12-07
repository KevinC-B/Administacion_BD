package com.automercado.bo;

import com.automercado.dao.VentaDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.Venta;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class VentaBO {
    
    private String mensaje = "";
    private VentaDAO ventadao = new VentaDAO();

    public String agregarVenta(Venta venta) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = ventadao.agregarVenta(conn, venta);
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

    public String modificarVenta(Venta venta) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = ventadao.modificarVenta(conn, venta);
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

    public String eliminarVenta(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = ventadao.eliminarVenta(conn, id);
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
    
    public void listaVenta(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            ventadao.listaVenta(conn, tabla);
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
