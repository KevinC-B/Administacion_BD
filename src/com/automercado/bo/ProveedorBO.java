package com.automercado.bo;

import com.automercado.dao.ProveedorDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.Proveedor;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class ProveedorBO {
    
    private String mensaje = "";
    private ProveedorDAO provdao = new ProveedorDAO();

    public String agregarProveedor(Proveedor prov) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = provdao.agregarProveedor(conn, prov);
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

    public String modificarProveedor(Proveedor prov) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = provdao.modificarProveedor(conn, prov);
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

    public String eliminarProveedor(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = provdao.eliminarProveedor(conn, id);
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
    
    public void listaProveedor(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            provdao.listaProveedor(conn, tabla);
        } catch (Exception e) {
            System.out.println("Error al listar proventes: " + e.getMessage());
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
