package cuentabancaria;

import conexion.SentenciasSql;
import javax.swing.JOptionPane;

/**
 *
 * @author carolina
 */
public class cuenta extends javax.swing.JFrame {

    public cuenta() {
        initComponents();
    }
    
    SentenciasSql sentencias = new SentenciasSql();
    
    
    public void activarAbono(){
        txtMontoAbono.setEnabled(true);
        btnAceptarA.setEnabled(true);
        btnCancelarA.setEnabled(true);
    }
    
    public void activarRetiro(){
        txtMontoRetiro.setEnabled(true);
        btnAceptarR.setEnabled(true);
        btnCancelarR.setEnabled(true);
    }
    
    public void desactivarAbono(){
        txtMontoAbono.setEnabled(false);
        btnAceptarA.setEnabled(false);
        btnCancelarA.setEnabled(false);
    }
    
    public void desactivarRetiro(){
        txtMontoRetiro.setEnabled(false);
        btnAceptarR.setEnabled(false);
        btnCancelarR.setEnabled(false);
    }
    
    public void actualizarSaldo(){
        String numeroCuenta = lblNumeroCuenta.getText();
        String saldo_total = sentencias.consultarSaldo(numeroCuenta);
        if (saldo_total.equals("No existe")) {
            JOptionPane.showMessageDialog(this, "La cuenta no existe","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            lblSaldo.setText(saldo_total);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNumeroCuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRetirar = new javax.swing.JButton();
        btnAbonar = new javax.swing.JButton();
        lblSaldo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMontoAbono = new javax.swing.JTextField();
        txtMontoRetiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptarA = new javax.swing.JButton();
        btnCancelarA = new javax.swing.JButton();
        btnAceptarR = new javax.swing.JButton();
        btnCancelarR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuenta bancaria");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(117, 226, 154));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel5.setText("Número de cuenta:");

        lblNumeroCuenta.setText("12345");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 177, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNumeroCuenta)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 70));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Saldo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        btnAbonar.setText("Abonar");
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        lblSaldo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("0");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 350, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 480, 10));

        txtMontoAbono.setBorder(null);
        txtMontoAbono.setEnabled(false);
        txtMontoAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoAbonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, 20));

        txtMontoRetiro.setBorder(null);
        txtMontoRetiro.setEnabled(false);
        txtMontoRetiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoRetiroKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 170, 20));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Añadir dinero:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Retirar dinero:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        btnAceptarA.setText("Aceptar");
        btnAceptarA.setEnabled(false);
        btnAceptarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        btnCancelarA.setText("Cancelar");
        btnCancelarA.setEnabled(false);
        btnCancelarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        btnAceptarR.setText("Aceptar");
        btnAceptarR.setEnabled(false);
        btnAceptarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        btnCancelarR.setText("Cancelar");
        btnCancelarR.setEnabled(false);
        btnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 10, 210));

        jLabel7.setText("Monto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel8.setText("Monto:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 170, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 170, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 480, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        activarRetiro();
        desactivarAbono();
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
        activarAbono();
        desactivarRetiro();
    }//GEN-LAST:event_btnAbonarActionPerformed

    private void btnCancelarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAActionPerformed
        desactivarAbono();
        txtMontoAbono.setText("");
    }//GEN-LAST:event_btnCancelarAActionPerformed

    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed
        desactivarRetiro();
        txtMontoRetiro.setText("");
    }//GEN-LAST:event_btnCancelarRActionPerformed

    private void btnAceptarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAActionPerformed
        if (txtMontoAbono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacio","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            float monto_abono = Float.parseFloat(txtMontoAbono.getText());
            if (monto_abono < 10000) {
                JOptionPane.showMessageDialog(this, "Abonos a partir de $10.000","Error",JOptionPane.ERROR_MESSAGE);
                txtMontoAbono.setText("");
            }else{
                String numeroCuenta = lblNumeroCuenta.getText();
                txtMontoAbono.setText("");
                sentencias.abono(monto_abono);
                sentencias.cuentaTransaccion(numeroCuenta);
                sentencias.actualizarSaldoAbono(numeroCuenta,monto_abono);
                actualizarSaldo();
            }
        }
    }//GEN-LAST:event_btnAceptarAActionPerformed

    private void btnAceptarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRActionPerformed
        if (txtMontoRetiro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"El campo no puede estar vacío","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            float monto_retiro = Float.parseFloat(txtMontoRetiro.getText());
            if (monto_retiro < 10000) {
                JOptionPane.showMessageDialog(this,"Retiros a partir de $10.000","Error",JOptionPane.ERROR_MESSAGE);
                txtMontoRetiro.setText("");
            }else{
                String numeroCuenta = lblNumeroCuenta.getText();
                txtMontoRetiro.setText("");
                sentencias.retiro(monto_retiro, numeroCuenta);
                sentencias.cuentaTransaccionRetiro(numeroCuenta, monto_retiro);
                sentencias.actualizarSaldoRetiro(numeroCuenta,monto_retiro);
                actualizarSaldo();
            }
        }
    }//GEN-LAST:event_btnAceptarRActionPerformed

    private void txtMontoAbonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAbonoKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoAbonoKeyTyped

    private void txtMontoRetiroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoRetiroKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoRetiroKeyTyped

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
            java.util.logging.Logger.getLogger(cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbonar;
    private javax.swing.JButton btnAceptarA;
    private javax.swing.JButton btnAceptarR;
    private javax.swing.JButton btnCancelarA;
    private javax.swing.JButton btnCancelarR;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtMontoAbono;
    private javax.swing.JTextField txtMontoRetiro;
    // End of variables declaration//GEN-END:variables
}
