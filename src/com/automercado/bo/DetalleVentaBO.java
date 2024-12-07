package com.automercado.bo;

import com.automercado.dao.DetalleVentaDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.DetalleVenta;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class DetalleVentaBO {
    
    private String mensaje = "";
    private DetalleVentaDAO detalledao = new DetalleVentaDAO();

    public String agregarDetalleVenta(DetalleVenta detalle) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = detalledao.agregarDetalleVenta(conn, detalle);
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

    public String modificarDetalleVenta(DetalleVenta detalle) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = detalledao.modificarDetalleVenta(conn, detalle);
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

    public String eliminarDetalleVenta(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = detalledao.eliminarDetalleVenta(conn, id);
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
    
    public void listaDetalleVenta(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            detalledao.listaDetalleVenta(conn, tabla);
        } catch (Exception e) {
            System.out.println("Error al listar detalles: " + e.getMessage());
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
