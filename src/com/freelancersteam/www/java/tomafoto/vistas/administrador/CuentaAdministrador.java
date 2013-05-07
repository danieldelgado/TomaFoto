/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CuentaAdministrador.java
 *
 * Created on 03-may-2013, 22:15:25
 */
package com.freelancersteam.www.java.tomafoto.vistas.administrador;

import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.EmpleadoDaoImp;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.mensajero;
import com.freelancersteam.www.java.tomafoto.vistas.empleado.GestorEmpleado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumno
 */
public class CuentaAdministrador extends javax.swing.JDialog {
    Empleado e;
    

    /** Creates new form CuentaAdministrador */
    public CuentaAdministrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btneEliminar.setVisible(false);
        txtDni.requestFocus();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       
    }

    CuentaAdministrador(java.awt.Frame parent, boolean modal, int legajo) {
        super(parent, modal);
        initComponents();
        btneEliminar.setVisible(true);
        // obtener el admin
        e = new EmpleadoDaoImp().getEmpleado(legajo);
        // iniciar los componentes
        txtDni.setText(String.valueOf(e.getDni()));
        txtNombreAdmin.setText(e.getApellido()+" "+e.getNombre());
        txtClave.setText(e.getClave());
        txtClaveRepetir.setText(e.getClave());
        txtClave.requestFocus();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric18 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric16 = new org.edisoncor.gui.label.LabelMetric();
        txtClave = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric17 = new org.edisoncor.gui.label.LabelMetric();
        txtClaveRepetir = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtDni = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric19 = new org.edisoncor.gui.label.LabelMetric();
        txtNombreAdmin = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        btnBusquedaPersonal = new org.edisoncor.gui.button.ButtonIcon();
        btnGuardar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelarOperacion = new org.edisoncor.gui.button.ButtonIpod();
        btneEliminar = new org.edisoncor.gui.button.ButtonIpod();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUENTA DE ADMINISTRADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setOpaque(false);

        labelMetric18.setText("DNI");

        labelMetric16.setText("CLAVE");

        txtClave.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtClave.setFont(new java.awt.Font("Calibri", 1, 14));
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        labelMetric17.setText("REPETIR CLAVE");

        txtClaveRepetir.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtClaveRepetir.setFont(new java.awt.Font("Calibri", 1, 14));

        txtDni.setEditable(false);
        txtDni.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDni.setFont(new java.awt.Font("Calibri", 1, 14));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        labelMetric19.setText("AMINISTRADOR");

        txtNombreAdmin.setEditable(false);
        txtNombreAdmin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreAdmin.setFont(new java.awt.Font("Calibri", 1, 14));
        txtNombreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAdminActionPerformed(evt);
            }
        });

        btnBusquedaPersonal.setBackground(java.awt.SystemColor.controlDkShadow);
        btnBusquedaPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/binoculares.jpg"))); // NOI18N
        btnBusquedaPersonal.setText("buttonIcon1");
        btnBusquedaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaPersonalActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/GUARDAR.jpg"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setAnimacion(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelarOperacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/Atras.png"))); // NOI18N
        btnCancelarOperacion.setText("ATRAS");
        btnCancelarOperacion.setAnimacion(false);
        btnCancelarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOperacionActionPerformed(evt);
            }
        });

        btneEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/ELIMINAR3.jpg"))); // NOI18N
        btneEliminar.setText("ELIMINAR");
        btneEliminar.setAnimacion(false);
        btneEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(labelMetric17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBusquedaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtClaveRepetir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btneEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClaveRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtClaveActionPerformed

private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtDniActionPerformed

private void txtNombreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAdminActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtNombreAdminActionPerformed

private void btnBusquedaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaPersonalActionPerformed
        // instanceo la ventana a donde quiero ir
        GestorEmpleado ventanaPersonal = new GestorEmpleado(null, true, GestorEmpleado.VENTANA_GESTOR_ASISTENCIA);
        if (ventanaPersonal.isBotonSeleccionado()) {
            // si el usuario selecciono un empleado
            e = new EmpleadoDaoImp().getEmpleado(ventanaPersonal.getLegajo());
            txtNombreAdmin.setText(e.getApellido()+" "+e.getNombre());
            txtDni.setText(String.valueOf(e.getDni()));
            txtClave.requestFocus();
        }
}//GEN-LAST:event_btnBusquedaPersonalActionPerformed

private void btneEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneEliminarActionPerformed
          int resp =JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar la cuenta Administrador de: \n"+txtNombreAdmin.getText()+" ?", "ELIMINAR EMPLEADO",JOptionPane.OK_CANCEL_OPTION);
          if (resp==JOptionPane.OK_OPTION) {
              
              new EmpleadoDaoImp().deleteEmpleado(e);
              JOptionPane.showMessageDialog(rootPane, "La Eliminacion se realizo exitosamente ", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
              this.dispose();
          }
     
       
}//GEN-LAST:event_btneEliminarActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            if (txtClave.getText().equals(txtClaveRepetir.getText())) {
        // claves correcta
         e.setClave(txtClave.getText().trim());
         e.setAdministrador(true);
         new EmpleadoDaoImp().upDateEmpleado(e);
         mensajero.mensajeInformacionAtualizacionOK(this);
         
    } else {
        mensajero.mensajeError(this,"Las CLAVES no coinciden, corrija");
    }    
                
}//GEN-LAST:event_btnGuardarActionPerformed

private void btnCancelarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOperacionActionPerformed
       
       this.dispose();
}//GEN-LAST:event_btnCancelarOperacionActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CuentaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CuentaAdministrador dialog = new CuentaAdministrador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon btnBusquedaPersonal;
    private org.edisoncor.gui.button.ButtonIpod btnCancelarOperacion;
    private org.edisoncor.gui.button.ButtonIpod btnGuardar;
    private org.edisoncor.gui.button.ButtonIpod btneEliminar;
    private org.edisoncor.gui.label.LabelMetric labelMetric16;
    private org.edisoncor.gui.label.LabelMetric labelMetric17;
    private org.edisoncor.gui.label.LabelMetric labelMetric18;
    private org.edisoncor.gui.label.LabelMetric labelMetric19;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtClave;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtClaveRepetir;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtDni;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtNombreAdmin;
    // End of variables declaration//GEN-END:variables
}