package com.automercado.bo;

import com.automercado.dao.ProductoDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.Producto;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class ProductoBO {
    
    private String mensaje = "";
    private ProductoDAO pdao = new ProductoDAO();

    public String agregarProducto(Producto prod) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pdao.agregarProducto(conn, prod);
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

    public String modificarProducto(Producto prod) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pdao.modificarProducto(conn, prod);
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

    public String eliminarProducto(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pdao.eliminarProducto(conn, id);
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
    
    public void listaProducto(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            pdao.listaProducto(conn, tabla);
        } catch (Exception e) {
            System.out.println("Error al listar productos: " + e.getMessage());
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
