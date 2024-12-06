package com.automercado.dao;

import com.automercado.entity.Cliente;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {

    private String mensaje = "";

    public String agregarCliente(Connection con, Cliente cli) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO clientes (Id_cliente, Nombre, Direccion, Telefono, Correo_electronico, Fecha_registro) "
                + "VALUES(SEQ_CLIENTES.NEXTVAL,?,?,?,?,?)";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cli.getNombre());
            pst.setString(2, cli.getDireccion());
            pst.setString(3, cli.getTelefono());
            pst.setString(4, cli.getCorrero_Electronico());
            pst.setDate(5, new java.sql.Date(cli.getFecha_registro().getTime()));

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Cliente agregado correctamente.";
            } else {
                mensaje = "No se pudo agregar el cliente.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al agregar cliente. Transacción revertida: " + e.getMessage();
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

    public String modificarCliente(Connection con, Cliente cli) {

        PreparedStatement pst = null;
        String sql = "UPDATE clientes SET Nombre = ?, Direccion = ?, Telefono = ?, Correo_electronico = ?, Fecha_registro = ? WHERE Id_cliente = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cli.getNombre());
            pst.setString(2, cli.getDireccion());
            pst.setString(3, cli.getTelefono());
            pst.setString(4, cli.getCorrero_Electronico());
            pst.setDate(5, new java.sql.Date(cli.getFecha_registro().getTime()));
            pst.setInt(6, cli.getId_Cliente());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                con.commit();
                mensaje = "Cliente modificado correctamente.";
            } else {
                mensaje = "No se pudo modificar el cliente.";
            }
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                    mensaje = "Error al modificar cliente. Transacción revertida: " + e.getMessage();
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

    public String eliminarCliente(Connection con, int id) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM clientes WHERE ID_cliente = ?";
        String mensaje = "";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                mensaje = "Cliente eliminado correctamente.";
            } else {
                mensaje = "No se encontró ningún cliente con el ID proporcionado.";
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

    public void listaCliente(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRE", "DIRECCION", "TELEFONO", "CORREO ELECTRONICO", "FECHA REGISTRO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM Clientes ORDER BY Id_cliente"; //"SELECT Id_cliente, Nombre, Direccion, Telefono, Correo_electronico, Fecha_registro FROM Clientes ORDER BY Id_cliente";

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
