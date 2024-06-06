/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Operaciones extends javax.swing.JFrame {

    /**
     * Creates new form Operaciones
     */
    Registro registro;
    login login = new login();
    int codigo = 0;
    DateFormat modificarFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    
    
    public Operaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public Operaciones(Registro registro, login login){
        initComponents();
        this.registro = registro;
        this.login = login;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        codigo = registro.buscar(login.user);
        txtAreaUsuario.setText(registro.listaClientes.get(codigo).mostrarDatos());
    }
    
    public void actualizarClave(Registro registro, login login){
        this.registro = registro;
        this.login = login;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaUsuario = new javax.swing.JTextArea();
        btnCerrarSesion = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnConsultarMovimientos = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnCambiarClave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 98, 255));
        jPanel1.setInheritsPopupMenu(true);

        btnConsultar.setBackground(new java.awt.Color(225, 236, 244));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultar.setText("Consultar Saldo");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtAreaUsuario.setEditable(false);
        txtAreaUsuario.setBackground(new java.awt.Color(85, 114, 254));
        txtAreaUsuario.setColumns(20);
        txtAreaUsuario.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        txtAreaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaUsuario.setLineWrap(true);
        txtAreaUsuario.setRows(2);
        txtAreaUsuario.setTabSize(4);
        txtAreaUsuario.setText("\n");
        txtAreaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAreaUsuario.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        txtAreaUsuario.setFocusable(false);
        txtAreaUsuario.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(txtAreaUsuario);

        btnCerrarSesion.setBackground(new java.awt.Color(255, 168, 168));
        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnRetirar.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnDepositar.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnDepositar.setText("Depositar");
        btnDepositar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnConsultarMovimientos.setBackground(new java.awt.Color(225, 236, 244));
        btnConsultarMovimientos.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnConsultarMovimientos.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultarMovimientos.setText("Movimientos");
        btnConsultarMovimientos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultarMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMovimientosActionPerformed(evt);
            }
        });

        btnTransferencia.setBackground(new java.awt.Color(225, 236, 244));
        btnTransferencia.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(102, 102, 102));
        btnTransferencia.setText("Transferencia");
        btnTransferencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        btnCambiarClave.setBackground(new java.awt.Color(225, 236, 244));
        btnCambiarClave.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        btnCambiarClave.setForeground(new java.awt.Color(102, 102, 102));
        btnCambiarClave.setText("Cambiar clave");
        btnCambiarClave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarClaveActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(85, 114, 254));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OPERACIONES");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCambiarClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConsultarMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        String fila = "";
        System.out.println(codigo);
        String[] opciones = {"Mostrar en Pantalla", "Imprimir ticket"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "CONSULTAR SALDO","BANCO MERCANTIL",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        
        switch (eleccion) {
            case 0:
                try{
                    txtAreaUsuario.setText(null);
        
                    fila = registro.listaClientes.get(codigo).mostrarDatos();
                    txtAreaUsuario.append(fila); 

                }catch(NullPointerException e1){
                    JOptionPane.showMessageDialog(this, e1.getMessage() + "\n\nEl usuario no ha iniciado sesion", "ERROR", JOptionPane.ERROR_MESSAGE);
                }  
            break;
            case 1:
               txtAreaUsuario.setText("======================================="
                       + "\n\nNO HAY PAPEL"
                       + "\n\nNO SE PUEDE IMPRIMIR EL COMPROBANTE");
            break;
        }
        
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        
       this.setVisible(false);
       login.setVisible(true);
       login.repaint();
       login.validate();
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        
        try{
            
            txtAreaUsuario.setText(null);
            float monto = 0f;
            
            monto = Float.parseFloat(JOptionPane.showInputDialog(this, "Ingresa el monto a retirar", "MONTO", JOptionPane.QUESTION_MESSAGE ));
            
            if (monto >= 1 ){
                if (registro.listaClientes.get(codigo).cuenta > monto){
                
                    registro.listaClientes.get(codigo).retirar(monto);
                    JOptionPane.showMessageDialog(this, "Retiro realizado", "OPERACION EXITOSA!", JOptionPane.INFORMATION_MESSAGE);

                    String resumen = "======================="
                            + "\nRETIRO REALIZADO CON ÉXITO!"
                            + "\n\nSU SALDO ES: "+registro.listaClientes.get(codigo).cuenta;


                    txtAreaUsuario.append(resumen);

                    // INGRESAR MOVIMIENTO
                    Date fecha = new Date();
                    String mov = "Retiro ------ "+String.valueOf(monto)+ " AR$ ----- "+modificarFecha.format(fecha);
                    registro.listaClientes.get(codigo).ingresarMovimiento(mov);
                
                } else {
                    JOptionPane.showMessageDialog(rootPane, "FONDOS INSUFICIENTES !!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El monto debe de ser mayor a 1 !!!", "ERROR", JOptionPane.WARNING_MESSAGE);
            } 
            
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(rootPane, e1.getMessage() + "\n\nSOLO NUMEROS !!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }catch (NullPointerException e2) {
            JOptionPane.showMessageDialog(rootPane, e2.getMessage()+ "\n\nDebes de iniciar sesión", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed

        try{
            txtAreaUsuario.setText(null);
            float monto = 0f;
            float montoR = 0f;
            int tipo = -1;
            String mov = "";
            
            
            String[] deposito = {"Efectivo", "Cheque","CANCELAR"};
            
            tipo = JOptionPane.showOptionDialog(rootPane, "Depositos con cheque"
                    + "\nTienen 5% de recargo", "DEPOSITO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, deposito, deposito[0]);
            
            if (tipo >= 0 && tipo != 2){
                
                monto = Float.parseFloat(JOptionPane.showInputDialog(this, "Ingresa el monto a depositar", "MONTO", JOptionPane.QUESTION_MESSAGE ));
                
                if (monto >= 1){
                    
                    if(tipo == 1){
                    
                        monto = monto;
                        montoR = monto *0.95f;
                        registro.listaClientes.get(codigo).depositar(montoR);
                        JOptionPane.showMessageDialog(this, "Deposito realizado"
                            + "\nmonto: "+montoR+"\nComision: "+monto*0.05, "OPERACION EXITOSA!", JOptionPane.INFORMATION_MESSAGE);

                        // INGRESAR MOVIMIENTO
                        Date fecha = new Date();
                        mov = "Deposito ------ "+String.valueOf(montoR) + " AR$ ----- "+modificarFecha.format(fecha)+
                                "\nmonto: "+monto+"\nComision: "+monto*0.05;
                    } else {

                        registro.listaClientes.get(codigo).depositar(monto);
                        JOptionPane.showMessageDialog(this, "Deposito realizado"
                            + "\nmonto: "+monto, "OPERACION EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
                        Date fecha = new Date();
                        mov = "Deposito ------ "+String.valueOf(monto) + " AR$ ----- "+modificarFecha.format(fecha)+
                                "\nmonto: "+monto+"\nComision: "+0;
                    }

                    String resumen = "======================="
                            + "\nDEPOSITO REALIZADO CON ÉXITO!"
                            + "\n\nSU SALDO ES: "+registro.listaClientes.get(codigo).cuenta;

                    txtAreaUsuario.append(resumen);
                    registro.listaClientes.get(codigo).ingresarMovimiento(mov);
                    
                } else{
                    JOptionPane.showMessageDialog(rootPane, "El monto debe de ser mayor a 1 !!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                
                

            }
        }catch (NumberFormatException e1){
            JOptionPane.showMessageDialog(rootPane, e1.getMessage()+ "\n\nSolo numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e2) {
            JOptionPane.showMessageDialog(rootPane, e2.getMessage()+ "\n\nDebes de iniciar sesión", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnConsultarMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMovimientosActionPerformed
        
        
        try{
            txtAreaUsuario.setText(null);
            txtAreaUsuario.append(registro.listaClientes.get(codigo).mostrarMovimientos());
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e + "\n\nDebes de iniciar sesion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnConsultarMovimientosActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        
        Transferencia tf = new Transferencia(registro, login);
        this.setVisible(false);
        tf.setVisible(true);
        tf.validate();
        tf.repaint();
        
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarClaveActionPerformed
        
        cambiarClave cc = new cambiarClave(registro, login);
        this.setVisible(false);
        cc.setVisible(true);
        cc.repaint();
        cc.validate();
        
    }//GEN-LAST:event_btnCambiarClaveActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarClave;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarMovimientos;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaUsuario;
    // End of variables declaration//GEN-END:variables
}
