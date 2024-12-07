package com.automercado.dao;

import com.automercado.entity.DetalleVenta;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DetalleVentaDAO {
    
    private String mensaje = "";

    public String agregarDetalleVenta(Connection con, DetalleVenta dventa) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Detalle_Ventas (Id_detalle, Id_venta, Id_producto, Cantidad, Precio_unitario) "
                + "VALUES (SEQ_DETALLEVENTAS.NEXTVAL, ?, ?, ?, ?)";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, dventa.getId_Venta()); 
            pst.setInt(2, dventa.getId_Producto()); 
            pst.setInt(3, dventa.getCantidad()); 
            pst.setInt(4, dventa.getPrecio_Unitario()); 

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Detalle agregada correctamente.";
            } else {
                mensaje = "No se pudo agregar el detalle.";
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
    
    public String modificarDetalleVenta(Connection con, DetalleVenta dventa) {

        PreparedStatement pst = null;
        String sql = "UPDATE Detalle_Ventas SET Id_Venta = ?, Id_producto = ?, Cantidad = ?, Precio_unitario = ? WHERE Id_detalle = ?";
        String mensaje = "";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, dventa.getId_Venta()); 
            pst.setInt(2, dventa.getId_Producto()); 
            pst.setInt(3, dventa.getCantidad()); 
            pst.setInt(4, dventa.getPrecio_Unitario());
            pst.setLong(5, dventa.getId_Detalle());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Detalle modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar el detalle.";
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
    
    public String eliminarDetalleVenta(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Detalle_Ventas WHERE Id_detalle = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Detalle eliminado correctamente.";
            } else {
                mensaje = "No se encontró ningún detalle de venta con el ID proporcionado.";
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
    
    public void listaDetalleVenta(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "ID VENTA", "ID PRODUCTO", "CANTIDAD", "PRECIO UNITARIO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Detalle_Ventas ORDER BY Id_detalle";

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
