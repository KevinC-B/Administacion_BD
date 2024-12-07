package com.automercado.dao;

import com.automercado.entity.Venta;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentaDAO {

    private String mensaje = "";

    public String agregarVenta(Connection con, Venta venta) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Ventas (Id_venta, Id_cliente, Fecha_venta, Monto_total, Medio_pago) "
                + "VALUES (SEQ_VENTAS.NEXTVAL, ?, ?, ?, ?)";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, venta.getId_Cliente());
            pst.setDate(2, new java.sql.Date(venta.getFecha_Venta().getTime()));
            pst.setDouble(3, venta.getMonto_Total());
            pst.setString(4, venta.getMedio_Pago()); 

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Venta agregada correctamente.";
            } else {
                mensaje = "No se pudo agregar la venta.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al agregar venta. Transacción revertida: " + e.getMessage();
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
    
    public String modificarVenta(Connection con, Venta venta) {

        PreparedStatement pst = null;
        String sql = "UPDATE Ventas SET Id_cliente = ?, Fecha_venta = ?, Monto_total = ?, Medio_pago = ? WHERE Id_venta = ?";
        String mensaje = "";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, venta.getId_Cliente());
            pst.setDate(2, new java.sql.Date(venta.getFecha_Venta().getTime()));
            pst.setDouble(3, venta.getMonto_Total());
            pst.setString(4, venta.getMedio_Pago());
            pst.setLong(5, venta.getId_Venta());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Venta modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar la venta.";
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
    
    public String eliminarVenta(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Ventas WHERE Id_venta = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Venta eliminada correctamente.";
            } else {
                mensaje = "No se encontró ningúna venta con el ID proporcionado.";
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
    
    public void listaVenta(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "CLIENTE", "FECHA VENTA", "MONTO PAGADO", "MEDIO PAGO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Ventas ORDER BY Id_venta";

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
