package com.automercado.dao;

import com.automercado.entity.Empleado;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpleadoDAO {

    private String mensaje = "";

    public String agregarEmpleado(Connection con, Empleado emp) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Empleados (Id_empleado, Nombre_empleado, Cargo, Fecha_contratacion, Salario, Id_gerente) "
                + "VALUES (SEQ_EMPLEADOS.NEXTVAL, ?, ?, ?, ?, ?)";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombre_Empleado());
            pst.setString(2, emp.getCargo());
            pst.setDate(3, new java.sql.Date(emp.getFecha_Contratacion().getTime()));
            pst.setDouble(4, emp.getSalario());
            if (emp.getId_Gerente() != null) {
                pst.setInt(5, emp.getId_Gerente());
            } else {
                pst.setNull(5, Types.INTEGER);
            }

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Empleado agregado correctamente.";
            } else {
                mensaje = "No se pudo agregar el empleado.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al agregar empleado. Transacción revertida: " + e.getMessage();
                }
            } catch (SQLException rollbackEx) {
                mensaje += " Error al revertir la transacción: " + rollbackEx.getMessage();
            }
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                mensaje += " Error al cerrar recursos: " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String modificarEmpleado(Connection con, Empleado emp) {

        PreparedStatement pst = null;
        String sql = "UPDATE Empleados SET Nombre_empleado = ?, Cargo = ?, Fecha_contratacion = ?, Salario = ?, Id_gerente = ? WHERE Id_empleado = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombre_Empleado());
            pst.setString(2, emp.getCargo());
            pst.setDate(3, new java.sql.Date(emp.getFecha_Contratacion().getTime()));
            pst.setDouble(4, emp.getSalario());
            if (emp.getId_Gerente() != null) {
                pst.setInt(5, emp.getId_Gerente());
            } else {
                pst.setNull(5, Types.INTEGER);
            }
            pst.setInt(6, emp.getId_Empleado());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Empleado modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar el empleado.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al modificar empleado. Transacción revertida: " + e.getMessage();
                }
            } catch (SQLException rollbackEx) {
                mensaje += " Error al revertir la transacción: " + rollbackEx.getMessage();
            }
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                mensaje += " Error al cerrar recursos: " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String eliminarEmpleado(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Empleados WHERE Id_empleado = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Empleado eliminado correctamente.";
            } else {
                mensaje = "No se encontró ningún empleado con el ID proporcionado.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                mensaje += " Error al revertir la transacción: " + rollbackEx.getMessage();
            }
            mensaje = "Error al eliminar empleado: " + e.getMessage();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                mensaje += " Error al cerrar recursos: " + e.getMessage();
            }
        }
        return mensaje;
    }

    public void listaEmpleado(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRE", "CARGO", "FECHA CONTRATACION", "SALARIO", "ID GERENTE"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Empleados ORDER BY Id_empleado";

        String[] filas = new String[6];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar la tabla: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
}
