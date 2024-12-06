package com.automercado.dao;

import com.automercado.entity.Producto;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductoDAO {

    private String mensaje = "";

    public String agregarProducto(Connection con, Producto prod) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Producto (Id_producto, Nombre_producto, Descripcion, Precio, Stock_actual, Categoria) "
                + "VALUES (SEQ_PRODUCTO.NEXTVAL, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, prod.getNombre_Producto());
            pst.setString(2, prod.getDescripcion());
            pst.setDouble(3, prod.getPrecio());
            pst.setInt(4, prod.getStock_Actual());
            pst.setString(5, prod.getCategoria());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Producto agregado correctamente.";
            } else {
                mensaje = "No se pudo agregar el producto.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al agregar producto. Transacción revertida: " + e.getMessage();
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

    public String modificarProducto(Connection con, Producto prod) {
        PreparedStatement pst = null;
        String sql = "UPDATE Producto SET Nombre_producto = ?, Descripcion = ?, Precio = ?, Stock_actual = ?, Categoria = ? WHERE Id_producto = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, prod.getNombre_Producto());
            pst.setString(2, prod.getDescripcion());
            pst.setDouble(3, prod.getPrecio());
            pst.setInt(4, prod.getStock_Actual());
            pst.setString(5, prod.getCategoria());
            pst.setInt(6, prod.getId_Producto());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Producto modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar el producto.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al modificar producto. Transacción revertida: " + e.getMessage();
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

    public String eliminarProducto(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Producto WHERE Id_producto = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Producto eliminado correctamente.";
            } else {
                mensaje = "No se encontró ningún producto con el ID proporcionado.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                mensaje += " Error al revertir la transacción: " + rollbackEx.getMessage();
            }
            mensaje = "Error al eliminar producto: " + e.getMessage();
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

    public void listaProducto(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRE", "DESCRIPCION", "PRECIO", "STOCK", "CATEGORIA"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Producto ORDER BY Id_producto";

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
