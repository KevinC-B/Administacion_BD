package com.automercado.dao;

import com.automercado.entity.Inventario;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InventarioDAO {
    
    private String mensaje = "";

    public String agregarInventario(Connection con, Inventario inv) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Inventario (Id_inventario, Id_producto, Stock_inicial, Stock_actualizado, Fecha_actualizacion) "
                + "VALUES (SEQ_INVENTARIO.NEXTVAL, ?, ?, ?, ?)";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, inv.getId_Producto());
            pst.setInt(2, inv.getStock_Inicial());
            pst.setInt(3, inv.getStock_Actualizado());
            pst.setDate(4, new java.sql.Date(inv.getFecha_Actualizacion().getTime()));

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Inventario agregado correctamente.";
            } else {
                mensaje = "No se pudo agregar el inventario.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al agregar inv. Transacción revertida: " + e.getMessage();
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
    
    public String modificarInventario(Connection con, Inventario inv) {

        PreparedStatement pst = null;
        String sql = "UPDATE Inventario SET Id_producto = ?, Stock_inicial = ?, Stock_actualizado = ?, Fecha_actualizacion = ? WHERE Id_inventario = ?";
        String mensaje = "";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, inv.getId_Producto());
            pst.setInt(2, inv.getStock_Inicial());
            pst.setInt(3, inv.getStock_Actualizado());
            pst.setDate(4, new java.sql.Date(inv.getFecha_Actualizacion().getTime()));
            pst.setInt(5, inv.getId_Inventario());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Inventario modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar inventario.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al modificar venta. Transacción revertida: " + e.getMessage();
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
    
    public String eliminarInventario(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Inventario WHERE Id_inventario = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Inventario eliminado correctamente.";
            } else {
                mensaje = "No se encontró ningún inventario con el ID proporcionado.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                mensaje += " Error al revertir la transacción: " + rollbackEx.getMessage();
            }
            mensaje = "Error al eliminar inventario: " + e.getMessage();
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
    
    public void listaInventario(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "ID PRODUCTO", "STOCK INICIAL", "STOCK ACTUALIZADO", "FECHA ACTUALIZACION"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Inventario ORDER BY Id_inventario";

        String[] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
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
