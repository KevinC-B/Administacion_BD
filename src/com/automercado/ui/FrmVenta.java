/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.automercado.ui;

import com.automercado.bo.VentaBO;
import com.automercado.entity.Venta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kev17
 */
public class FrmVenta extends javax.swing.JFrame {

    /**
     * Creates new form FrmVenta
     */
    private VentaBO ventabo = new VentaBO();

    public FrmVenta() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablaVentas();
    }

    public void listarProveedor() {
        ventabo.listaVenta(tblVentas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEliminarVenta = new javax.swing.JButton();
        lblIdVenta = new javax.swing.JLabel();
        btnAgregarVenta = new javax.swing.JButton();
        btnModificarVenta = new javax.swing.JButton();
        txtMontoPagar = new javax.swing.JTextField();
        txtMetodoPago = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        lblFechaVenta = new javax.swing.JLabel();
        dtFechaVenta = new com.toedter.calendar.JDateChooser();
        lblMetodoPago = new javax.swing.JLabel();
        lblMontoPagar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarVenta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/borrar_icon.png"))); // NOI18N
        btnEliminarVenta.setText("Eliminar");
        btnEliminarVenta.setToolTipText("");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 30));

        lblIdVenta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblIdVenta.setForeground(new java.awt.Color(51, 51, 51));
        lblIdVenta.setText("ID:");
        jPanel1.add(lblIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        btnAgregarVenta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/mas_icon.png"))); // NOI18N
        btnAgregarVenta.setText("Agregar");
        btnAgregarVenta.setToolTipText("");
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 120, 30));

        btnModificarVenta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/editar_icon.png"))); // NOI18N
        btnModificarVenta.setText("Modificar");
        btnModificarVenta.setToolTipText("");
        btnModificarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 120, 30));

        txtMontoPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoPagarActionPerformed(evt);
            }
        });
        jPanel1.add(txtMontoPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 30));

        txtMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetodoPagoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 180, 30));

        lblIdCliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblIdCliente.setText("CLIENTE:");
        jPanel1.add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        txtIdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 30));

        lblFechaVenta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblFechaVenta.setForeground(new java.awt.Color(51, 51, 51));
        lblFechaVenta.setText("FECHA VENTA:");
        jPanel1.add(lblFechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));
        jPanel1.add(dtFechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 30));

        lblMetodoPago.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblMetodoPago.setForeground(new java.awt.Color(51, 51, 51));
        lblMetodoPago.setText("METODO DE PAGO:");
        jPanel1.add(lblMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        lblMontoPagar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblMontoPagar.setForeground(new java.awt.Color(51, 51, 51));
        lblMontoPagar.setText("MONTO PAGAR:");
        jPanel1.add(lblMontoPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/limpiar_icon.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 30));

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("VENTAS");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/atras_icon.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setToolTipText("");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 110, 30));

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVentas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 87, 480, 390));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/img/ventas.jpg"))); // NOI18N
        jPanel1.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        if (txtIdVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del venta a eliminar");
        } else {
            VentaBO ventaBO = new VentaBO();
            String mensaje = ventaBO.eliminarVenta(Integer.parseInt(txtIdVenta.getText()));

            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            cargarTablaVentas();
        }
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
        if (txtIdCliente.getText().isEmpty() || txtMontoPagar.getText().isEmpty()
                || txtMetodoPago.getText().isEmpty() || dtFechaVenta.getDate() == null) {

            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        } else {
            Venta venta = new Venta();
            venta.setId_Cliente(Integer.parseInt(txtIdCliente.getText()));
            Date fechaVenta = dtFechaVenta.getDate();
            venta.setFecha_Venta(fechaVenta);
            venta.setMonto_Total(Double.parseDouble(txtMontoPagar.getText()));
            venta.setMedio_Pago(txtMetodoPago.getText());
            venta.setId_Venta(Long.parseLong(txtIdVenta.getText()));

            VentaBO ventaBO = new VentaBO();
            String mensaje = ventaBO.agregarVenta(venta);

            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            cargarTablaVentas();
        }
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void btnModificarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVentaActionPerformed
        if (txtIdVenta.getText().isEmpty() || txtIdCliente.getText().isEmpty()
                || txtMontoPagar.getText().isEmpty() || txtMetodoPago.getText().isEmpty()
                || dtFechaVenta.getDate() == null) {

            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        } else {
            Venta venta = new Venta();
            venta.setId_Venta(Long.parseLong(txtIdVenta.getText()));
            venta.setId_Cliente(Integer.parseInt(txtIdCliente.getText()));
            Date fechaVenta = dtFechaVenta.getDate();
            venta.setFecha_Venta(fechaVenta);
            venta.setMonto_Total(Double.parseDouble(txtMontoPagar.getText()));
            venta.setMedio_Pago(txtMetodoPago.getText());

            VentaBO ventaBO = new VentaBO();
            String mensaje = ventaBO.modificarVenta(venta);

            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            cargarTablaVentas();
        }
    }//GEN-LAST:event_btnModificarVentaActionPerformed

    private void txtMontoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoPagarActionPerformed

    private void txtMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetodoPagoActionPerformed

    private void txtIdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVentaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmIndex frmind = new FrmIndex();
        frmind.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
        int seleccion = tblVentas.rowAtPoint(evt.getPoint());
        txtIdVenta.setText(tblVentas.getValueAt(seleccion, 0) + "");
        txtIdCliente.setText(tblVentas.getValueAt(seleccion, 1) + "");
        String fechaString = (String) tblVentas.getValueAt(seleccion, 2); // Cambia el índice si es necesario
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato según sea necesario
        try {
            Date fechaRegistro = formato.parse(fechaString); //Convierte la cadena a Date
            dtFechaVenta.setDate(fechaRegistro); //Establece la fecha en el JDateChooser
        } catch (ParseException e) {
            e.printStackTrace(); //Maneja la excepción según sea necesario
            JOptionPane.showMessageDialog(null, "Error al convertir la fecha: " + e.getMessage());
        }
        txtMontoPagar.setText(tblVentas.getValueAt(seleccion, 3) + "");
        txtMetodoPago.setText(tblVentas.getValueAt(seleccion, 4) + "");
    }//GEN-LAST:event_tblVentasMouseClicked

    public void limpiar() {
        txtIdVenta.setText("");
        txtIdCliente.setText("");
        dtFechaVenta.setDate(null);
        txtMontoPagar.setText("");
        txtMetodoPago.setText("");
    }

    private void cargarTablaVentas() {
        VentaBO ventaBO = new VentaBO();
        ventaBO.listaVenta(tblVentas);
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
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVenta;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarVenta;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser dtFechaVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFechaVenta;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblIdVenta;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMetodoPago;
    private javax.swing.JLabel lblMontoPagar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtMetodoPago;
    private javax.swing.JTextField txtMontoPagar;
    // End of variables declaration//GEN-END:variables
}
