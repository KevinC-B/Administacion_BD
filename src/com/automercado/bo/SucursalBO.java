package com.automercado.bo;

import com.automercado.dao.SucursalDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.Sucursal;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class SucursalBO {
    
    private String mensaje = "";
    private SucursalDAO sucdao = new SucursalDAO();

    public String agregarSucursal(Sucursal suc) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sucdao.agregarSucursal(conn, suc);
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

    public String modificarSucursal(Sucursal suc) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sucdao.modificarSucursal(conn, suc);
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

    public String eliminarSucursal(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sucdao.eliminarSucursal(conn, id);
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
    
    public void listaSucursal(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            sucdao.listaSucursal(conn, tabla);
        } catch (Exception e) {
            System.out.println("Error al listar sucursales: " + e.getMessage());
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
