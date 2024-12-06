package com.automercado.bo;

import com.automercado.dao.EmpleadoDAO;
import com.automercado.db.Conexion;
import com.automercado.entity.Empleado;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class EmpleadoBO {
    
    private String mensaje = "";
    private EmpleadoDAO edao = new EmpleadoDAO();

    public String agregarEmpleado(Empleado emp) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarEmpleado(conn, emp);
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

    public String modificarEmpleado(Empleado emp) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modificarEmpleado(conn, emp);
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

    public String eliminarEmpleado(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarEmpleado(conn, id);
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
    
    public void listaEmpleado(JTable tabla) {
        Connection conn = Conexion.getConnection();
        try {
            edao.listaEmpleado(conn, tabla);
        } catch (Exception e) {
            System.out.println("Error al listar empleados: " + e.getMessage());
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
