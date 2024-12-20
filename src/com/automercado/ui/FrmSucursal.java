/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.automercado.ui;

import com.automercado.bo.SucursalBO;
import com.automercado.entity.Sucursal;
import javax.swing.JOptionPane;

/**
 *
 * @author kev17
 */
public class FrmSucursal extends javax.swing.JFrame {

    /**
     * Creates new form FrmSucursal
     */
    private SucursalBO sucbo = new SucursalBO();
    
    public FrmSucursal() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablaSucursales();
    }
    
    public void listarSucursales() {
        sucbo.listaSucursal(tblSucursales);
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
        lblTitulo = new javax.swing.JLabel();
        lblIdSucursal = new javax.swing.JLabel();
        lblNombreSucursal = new javax.swing.JLabel();
        lblDireccionSucursal = new javax.swing.JLabel();
        lblTelefonoSucursal = new javax.swing.JLabel();
        lblIdGerenteSucursal = new javax.swing.JLabel();
        txtIdGerenteSucursal = new javax.swing.JTextField();
        txtIdSucursal = new javax.swing.JTextField();
        txtNombreSucursal = new javax.swing.JTextField();
        txtTelefonoSucursal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDireccionSucursal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSucursales = new javax.swing.JTable();
        btnAgregarSucursal = new javax.swing.JButton();
        btnModificarSucursal = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminarSucursal = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 255));
        lblTitulo.setText("SUCURSALES");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lblIdSucursal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblIdSucursal.setForeground(new java.awt.Color(0, 204, 255));
        lblIdSucursal.setText("ID:");
        jPanel1.add(lblIdSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        lblNombreSucursal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNombreSucursal.setForeground(new java.awt.Color(0, 204, 255));
        lblNombreSucursal.setText("NOMBRE:");
        jPanel1.add(lblNombreSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        lblDireccionSucursal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDireccionSucursal.setForeground(new java.awt.Color(0, 204, 255));
        lblDireccionSucursal.setText("DIRECCION:");
        jPanel1.add(lblDireccionSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblTelefonoSucursal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTelefonoSucursal.setForeground(new java.awt.Color(0, 204, 255));
        lblTelefonoSucursal.setText("TELEFONO:");
        jPanel1.add(lblTelefonoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));

        lblIdGerenteSucursal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblIdGerenteSucursal.setForeground(new java.awt.Color(0, 204, 255));
        lblIdGerenteSucursal.setText("ID GERENTE:");
        jPanel1.add(lblIdGerenteSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        txtIdGerenteSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdGerenteSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdGerenteSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 240, 30));

        txtIdSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, 30));

        txtNombreSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 220, 30));

        txtTelefonoSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefonoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, 30));

        txaDireccionSucursal.setColumns(10);
        txaDireccionSucursal.setLineWrap(true);
        txaDireccionSucursal.setRows(5);
        txaDireccionSucursal.setTabSize(1);
        txaDireccionSucursal.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaDireccionSucursal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 310, 80));

        tblSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSucursalesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSucursales);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 510, 410));

        btnAgregarSucursal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregarSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/mas_icon.png"))); // NOI18N
        btnAgregarSucursal.setText("Agregar");
        btnAgregarSucursal.setToolTipText("");
        btnAgregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, 30));

        btnModificarSucursal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificarSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/editar_icon.png"))); // NOI18N
        btnModificarSucursal.setText("Modificar");
        btnModificarSucursal.setToolTipText("");
        btnModificarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 120, 30));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/atras_icon.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setToolTipText("");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 110, 30));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/limpiar_icon.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 30));

        btnEliminarSucursal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEliminarSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/icon/borrar_icon.png"))); // NOI18N
        btnEliminarSucursal.setText("Eliminar");
        btnEliminarSucursal.setToolTipText("");
        btnEliminarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 120, 30));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/automercado/img/sucursal.jpg"))); // NOI18N
        jPanel1.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdGerenteSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdGerenteSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdGerenteSucursalActionPerformed

    private void txtIdSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSucursalActionPerformed

    private void txtNombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSucursalActionPerformed

    private void txtTelefonoSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoSucursalActionPerformed

    private void tblSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSucursalesMouseClicked
        int seleccion = tblSucursales.rowAtPoint(evt.getPoint());
        txtIdSucursal.setText(tblSucursales.getValueAt(seleccion, 0) + "");
        txtNombreSucursal.setText(tblSucursales.getValueAt(seleccion, 1) + "");
        txtTelefonoSucursal.setText(tblSucursales.getValueAt(seleccion, 2) + "");
        txaDireccionSucursal.setText(tblSucursales.getValueAt(seleccion, 3) + "");
        txtIdGerenteSucursal.setText(tblSucursales.getValueAt(seleccion, 4) + "");
    }//GEN-LAST:event_tblSucursalesMouseClicked

    private void btnAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSucursalActionPerformed
        if (txtNombreSucursal.getText().isEmpty() || txtTelefonoSucursal.getText().isEmpty() || txaDireccionSucursal.getText().isEmpty()
            || txtIdGerenteSucursal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor completo todos los campos");
        } else {
            Sucursal suc = new Sucursal();
            suc.setNombre_Sucursal(txtNombreSucursal.getText());
            suc.setDireccion_Sucursal(txaDireccionSucursal.getText());
            suc.setTelefono_Sucursal(txtTelefonoSucursal.getText());
            suc.setId_Gerente(Integer.parseInt(txtIdGerenteSucursal.getText()));

            SucursalBO sucursalBO = new SucursalBO();
            String mensaje = sucursalBO.agregarSucursal(suc);

            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarSucursales();
            cargarTablaSucursales();
        }
    }//GEN-LAST:event_btnAgregarSucursalActionPerformed

    private void btnModificarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSucursalActionPerformed
        if (txtNombreSucursal.getText().isEmpty() || txtTelefonoSucursal.getText().isEmpty() || txaDireccionSucursal.getText().isEmpty()
            || txtIdGerenteSucursal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor completo todos los campos");
        } else {
            Sucursal suc = new Sucursal();
            suc.setId_Sucursal(Integer.parseInt(txtIdSucursal.getText()));
            suc.setNombre_Sucursal(txtNombreSucursal.getText());
            suc.setTelefono_Sucursal(txtTelefonoSucursal.getText());
            suc.setDireccion_Sucursal(txaDireccionSucursal.getText());
            suc.setId_Gerente(Integer.parseInt(txtIdGerenteSucursal.getText()));

            SucursalBO sucursalBO = new SucursalBO();
            String mensaje = sucursalBO.modificarSucursal(suc);

            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarSucursales();
            cargarTablaSucursales();
        }
    }//GEN-LAST:event_btnModificarSucursalActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmIndex frmind = new FrmIndex();
        frmind.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSucursalActionPerformed
        if (txtIdSucursal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor completo todos los campos");
        } else {
            SucursalBO sucursalBO = new SucursalBO();
            String mensaje = sucursalBO.eliminarSucursal(Integer.parseInt(txtIdSucursal.getText()));

            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarSucursales();
            cargarTablaSucursales();
        }
    }//GEN-LAST:event_btnEliminarSucursalActionPerformed

    public void limpiar() {
        txtIdSucursal.setText("");
        txtNombreSucursal.setText("");
        txtTelefonoSucursal.setText("");
        txaDireccionSucursal.setText("");
        txtIdGerenteSucursal.setText("");
    }

    private void cargarTablaSucursales() {
        SucursalBO sucursalBO = new SucursalBO();
        sucursalBO.listaSucursal(tblSucursales);
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
            java.util.logging.Logger.getLogger(FrmSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSucursal;
    private javax.swing.JButton btnEliminarSucursal;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarSucursal;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDireccionSucursal;
    private javax.swing.JLabel lblIdGerenteSucursal;
    private javax.swing.JLabel lblIdSucursal;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNombreSucursal;
    private javax.swing.JLabel lblTelefonoSucursal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblSucursales;
    private javax.swing.JTextArea txaDireccionSucursal;
    private javax.swing.JTextField txtIdGerenteSucursal;
    private javax.swing.JTextField txtIdSucursal;
    private javax.swing.JTextField txtNombreSucursal;
    private javax.swing.JTextField txtTelefonoSucursal;
    // End of variables declaration//GEN-END:variables
}
