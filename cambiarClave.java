/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banco;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class cambiarClave extends javax.swing.JFrame {

    Registro registro;
    login login;
    
    
    
    public cambiarClave() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }
    
    public cambiarClave(Registro registro,login login){
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.registro = registro;
        this.login = login;
        
    }

    public boolean nuevaClave(){
        Operaciones op = new Operaciones(registro, login);
        
        if(registro.listaClientes.get(op.codigo).getPass().equals(txtClaveVieja.getText())){
                if (passClaveNueva.getText().equals(passRepetirClave.getText())){
                    registro.listaClientes.get(op.codigo).setPass(passClaveNueva.getText());
                    JOptionPane.showMessageDialog(rootPane, "CLAVE CAMBIADA");
                    JOptionPane.showMessageDialog(rootPane, "Nueva clave: "+registro.listaClientes.get(op.codigo).pass);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Las claves no son iguales", "ERROR", JOptionPane.ERROR_MESSAGE);
                    passRepetirClave.setText(null);
                    passRepetirClave.requestFocus();
                    return false;
                }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Clave invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtClaveVieja.setText(null);
            txtClaveVieja.requestFocus();
            return false;
        } 
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtClaveVieja = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        passRepetirClave = new javax.swing.JPasswordField();
        passClaveNueva = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 98, 255));
        jPanel1.setInheritsPopupMenu(true);

        btnAceptar.setBackground(new java.awt.Color(0, 204, 51));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(85, 114, 254));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clave vieja");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(85, 114, 254));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nueva clave");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(85, 114, 254));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Repetir clave");
        jLabel5.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(85, 114, 254));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAMBIAR CLAVE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        txtClaveVieja.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtClaveVieja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtClaveVieja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveViejaKeyPressed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 56, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        passRepetirClave.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        passRepetirClave.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        passRepetirClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passRepetirClaveKeyPressed(evt);
            }
        });

        passClaveNueva.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        passClaveNueva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        passClaveNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passClaveNuevaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClaveVieja)
                            .addComponent(passRepetirClave)
                            .addComponent(passClaveNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClaveVieja)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passClaveNueva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passRepetirClave)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        try{
            boolean bien = nuevaClave();
            if (bien) {
                this.setVisible(false);
                Operaciones op = new Operaciones(registro, login);    // Necesito Registro y Login para actualizar datos.
                op.setVisible(true);
                op.repaint();
                op.validate();
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e+"\n\nDebes de iniciar sesión!!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        try{
            Operaciones op = new Operaciones(registro, login);
            this.setVisible(false);
            op.setVisible(true);
            op.repaint();
            op.validate();
        }catch(NullPointerException e1){
            JOptionPane.showMessageDialog(rootPane, e1+"\n\nDebes de iniciar sesión!!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtClaveViejaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveViejaKeyPressed
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            passClaveNueva.requestFocus();
        }
        
    }//GEN-LAST:event_txtClaveViejaKeyPressed

    private void passClaveNuevaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passClaveNuevaKeyPressed
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            passRepetirClave.requestFocus();
        }
        
    }//GEN-LAST:event_passClaveNuevaKeyPressed

    private void passRepetirClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passRepetirClaveKeyPressed
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            
            btnAceptar.doClick();
            
        }
        
    }//GEN-LAST:event_passRepetirClaveKeyPressed

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
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambiarClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passClaveNueva;
    private javax.swing.JPasswordField passRepetirClave;
    private javax.swing.JTextField txtClaveVieja;
    // End of variables declaration//GEN-END:variables
}
