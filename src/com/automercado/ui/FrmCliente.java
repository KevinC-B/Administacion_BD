/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.automercado.ui;

import com.automercado.bo.ClienteBO;
import com.automercado.entity.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kev17
 */
public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    private ClienteBO cbo = new ClienteBO();

    public FrmCliente() {
        initComponents();
        setLocationRelativeTo(null);
        //listarCliente();
        cargarTablaClientes();
    }

    public void listarCliente() {
        cbo.listaCliente(tblClientes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCliente = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        lblFechaRegistro = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDireccion = new javax.swing.JTextArea();
        dtFechaRegistro = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panCliente.setToolTipText("");
        panCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitulo.setLabelFor(lblTitulo);
        lblTitulo.setText("FORMULARIO CLIENTES");
        panCliente.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        lblIdCliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblIdCliente.setText("ID:");
        panCliente.add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNombre.setLabelFor(lblNombre);
        lblNombre.setText("NOMBRE:");
        panCliente.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDireccion.setText("DIRECCION:");
        panCliente.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTelefono.setText("TELEFONO:");
        panCliente.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 30));

        lblCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCorreoElectronico.setText("CORREO ELECTRONICO:");
        panCliente.add(lblCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 30));

        lblFechaRegistro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblFechaRegistro.setText("FECHA REGISTRO:");
        panCliente.add(lblFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 30));

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        panCliente.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 240, 30));

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        panCliente.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 100, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panCliente.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 220, 30));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        panCliente.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 220, 30));

        txaDireccion.setColumns(10);
        txaDireccion.setLineWrap(true);
        txaDireccion.setRows(5);
        txaDireccion.setTabSize(1);
        txaDireccion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaDireccion);

        panCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 340, 80));
        panCliente.add(dtFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 240, 30));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        panCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 510, 430));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/mas_icon.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panCliente.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 120, 30));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/editar_icon.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panCliente.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 120, 30));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/atras_icon.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setToolTipText("");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panCliente.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 110, 30));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/limpiar_icon.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panCliente.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 120, 30));

        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/borrar_icon.png"))); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setToolTipText("");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        panCliente.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 120, 30));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/img/clientes.jpg"))); // NOI18N
        panCliente.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 550));

        getContentPane().add(panCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txaDireccion.getText().isEmpty()
                || txtCorreoElectronico.getText().isEmpty()
                || dtFechaRegistro.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor completo todos los campos");
        } else {
            Cliente cli = new Cliente();
            cli.setNombre(txtNombre.getText());
            cli.setDireccion(txaDireccion.getText());
            cli.setTelefono(txtTelefono.getText());
            cli.setCorrero_Electronico(txtCorreoElectronico.getText());
            Date fechaRegistro = dtFechaRegistro.getDate();
            cli.setFecha_registro(fechaRegistro);
            
            ClienteBO clienteBO = new ClienteBO();
            String mensaje = clienteBO.agregarCliente(cli);
            
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCliente();
            cargarTablaClientes();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txaDireccion.getText().isEmpty()
                || txtCorreoElectronico.getText().isEmpty()
                || dtFechaRegistro.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor completo todos los campos");
        } else {
            Cliente cli = new Cliente();
            cli.setId_Cliente(Integer.parseInt(txtIdCliente.getText()));
            cli.setNombre(txtNombre.getText());
            cli.setDireccion(txaDireccion.getText());
            cli.setTelefono(txtTelefono.getText());
            cli.setCorrero_Electronico(txtCorreoElectronico.getText());
            Date fechaRegistro = dtFechaRegistro.getDate();
            cli.setFecha_registro(fechaRegistro);
            
            ClienteBO clienteBO = new ClienteBO();
            String mensaje = clienteBO.modificarCliente(cli);
            JOptionPane.showMessageDialog(null, mensaje);
            
            limpiar();
            listarCliente();
            cargarTablaClientes();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmIndex frmind = new FrmIndex();
        frmind.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        if (txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txaDireccion.getText().isEmpty()
                || txtCorreoElectronico.getText().isEmpty()
                || dtFechaRegistro.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor completo todos los campos");
        } else {
            ClienteBO clienteBO = new ClienteBO();
            String mensaje = clienteBO.eliminarCliente(Integer.parseInt(txtIdCliente.getText()));
            
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCliente();
            cargarTablaClientes();
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int seleccion = tblClientes.rowAtPoint(evt.getPoint());
        txtIdCliente.setText(tblClientes.getValueAt(seleccion, 0) + "");
        txtNombre.setText(tblClientes.getValueAt(seleccion, 1) + "");
        txaDireccion.setText(tblClientes.getValueAt(seleccion, 2) + "");
        txtTelefono.setText(tblClientes.getValueAt(seleccion, 3) + "");
        txtCorreoElectronico.setText(tblClientes.getValueAt(seleccion, 4) + "");
        String fechaString = (String) tblClientes.getValueAt(seleccion, 5); // Cambia el índice si es necesario
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato según sea necesario
        try {
            Date fechaRegistro = formato.parse(fechaString); //Convierte la cadena a Date
            dtFechaRegistro.setDate(fechaRegistro); //Establece la fecha en el JDateChooser
        } catch (ParseException e) {
            e.printStackTrace(); //Maneja la excepción según sea necesario
            JOptionPane.showMessageDialog(null, "Error al convertir la fecha: " + e.getMessage());
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    public void limpiar() {
        txtIdCliente.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txaDireccion.setText("");
        txtCorreoElectronico.setText("");
        dtFechaRegistro.setDate(null);
    }

    private void cargarTablaClientes() {
        ClienteBO clienteBO = new ClienteBO();
        clienteBO.listaCliente(tblClientes);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser dtFechaRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panCliente;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextArea txaDireccion;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}