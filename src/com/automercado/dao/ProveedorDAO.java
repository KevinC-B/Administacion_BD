package com.automercado.dao;

import com.automercado.entity.Proveedor;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProveedorDAO {

    private String mensaje = "";

    public String agregarProveedor(Connection con, Proveedor prov) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Proveedores (Id_proveedor, Nombre_proveedor, Direccion, Telefono, Correo_electronico, Id_producto) "
                + "VALUES (SEQ_PROVEEDORES.NEXTVAL, ?, ?, ?, ?, ?)";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, prov.getNombre_Proveedor());
            pst.setString(2, prov.getDireccion());
            pst.setString(3, prov.getTelefono());
            pst.setString(4, prov.getCorreo_Electronico());
            pst.setInt(5, prov.getId_Producto());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Proveedor agregado correctamente.";
            } else {
                mensaje = "No se pudo agregar el proveedor.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al agregar proveedor. Transacción revertida: " + e.getMessage();
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

    public String modificarProveedor(Connection con, Proveedor prov) {

        PreparedStatement pst = null;
        String sql = "UPDATE Proveedores SET Nombre_proveedor = ?, Direccion = ?, Telefono = ?, Correo_electronico = ?, Id_producto = ? WHERE Id_proveedor = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, prov.getNombre_Proveedor());
            pst.setString(2, prov.getDireccion());
            pst.setString(3, prov.getTelefono());
            pst.setString(4, prov.getCorreo_Electronico());
            pst.setInt(5, prov.getId_Producto());
            pst.setInt(6, prov.getId_Proveedor());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Proveedor modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar el proveedor.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al modificar proveedor. Transacción revertida: " + e.getMessage();
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

    public String eliminarProveedor(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Proveedores WHERE Id_proveedor = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Proveedor eliminado correctamente.";
            } else {
                mensaje = "No se encontró ningún proveedor con el ID proporcionado.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                mensaje += " Error al revertir la transacción: " + rollbackEx.getMessage();
            }
            mensaje = "Error al eliminar proveedor: " + e.getMessage();
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

    public void listaProveedor(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRE", "DIRECCION", "TELEFONO", "CORREO ELECTRONICO", "ID PRODUCTO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Proveedores ORDER BY Id_proveedor";
                //"SELECT Id_proveedor, Nombre, Direccion, Telefono, Correo_electronico, Fecha_registro FROM Proveedores ORDER BY Id_proveedor";

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
