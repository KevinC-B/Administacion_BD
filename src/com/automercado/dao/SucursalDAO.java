package com.automercado.dao;

import com.automercado.entity.Sucursal;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SucursalDAO {
    
    private String mensaje = "";

    public String agregarSucursal(Connection con, Sucursal suc) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Sucursales (Id_sucursal, Nombre_sucursal, Direccion_sucursal, Telefono_sucursal, ID_gerente) "
                + "VALUES(SEQ_SUCURSAL.NEXTVAL,?,?,?,?)";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, suc.getNombre_Sucursal());
            pst.setString(2, suc.getDireccion_Sucursal());
            pst.setString(3, suc.getTelefono_Sucursal());
            pst.setInt(4, suc.getId_Gerente());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Sucursal agregada correctamente.";
            } else {
                mensaje = "No se pudo agregar la sucursal.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al agregar sucursal. Transacción revertida: " + e.getMessage();
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
    
    public String modificarSucursal(Connection con, Sucursal suc) {

        PreparedStatement pst = null;
        String sql = "UPDATE Sucursales SET Nombre_sucursal = ?, Direccion_sucursal = ?, Telefono_sucursal = ?, ID_gerente = ? WHERE Id_sucursal = ?";
        String mensaje = "";
        
        try {
             pst = con.prepareStatement(sql);
            pst.setString(1, suc.getNombre_Sucursal());
            pst.setString(2, suc.getDireccion_Sucursal());
            pst.setString(3, suc.getTelefono_Sucursal());
            pst.setInt(4, suc.getId_Gerente());
            pst.setInt(5, suc.getId_Sucursal());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Sucursal modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar sucursal.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al modificar sucente. Transacción revertida: " + e.getMessage();
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
    
    public String eliminarSucursal(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Sucursales WHERE Id_sucursal = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Sucursal eliminada correctamente.";
            } else {
                mensaje = "No se encontró ningúna sucursal con el ID proporcionado.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                mensaje += " Error al revertir la transacción: " + rollbackEx.getMessage();
            }
            mensaje = "Error al eliminar cliente: " + e.getMessage();
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
    
    public void listaSucursal(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRE", "DIRECCION", "TELEFONO", "ID GERENTE"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Sucursales ORDER BY Id_sucursal";

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
