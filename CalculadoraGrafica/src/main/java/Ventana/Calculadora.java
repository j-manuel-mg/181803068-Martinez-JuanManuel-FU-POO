/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import CalculadoraGrafica.Aritmetica;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Manuel
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);

    }

    Aritmetica aritmetica = new Aritmetica();
    final String numero = "0";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumero1 = new javax.swing.JLabel();
        cajaNumero1 = new javax.swing.JTextField();
        lblNumero2 = new javax.swing.JLabel();
        cajaNumero2 = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        cajaResultado = new javax.swing.JTextField();
        lblMenu = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        barraMenu = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        lblNumero1.setBackground(new java.awt.Color(255, 255, 255));
        lblNumero1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNumero1.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero1.setText("Ingrese el primer numero:");

        cajaNumero1.setBackground(new java.awt.Color(255, 255, 255));
        cajaNumero1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaNumero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaNumero1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cajaNumero1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblNumero2.setBackground(new java.awt.Color(255, 255, 255));
        lblNumero2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNumero2.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero2.setText("Ingrese el segundo numero:");

        cajaNumero2.setBackground(new java.awt.Color(255, 255, 255));
        cajaNumero2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaNumero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaNumero2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cajaNumero2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("resultado:");

        cajaResultado.setBackground(new java.awt.Color(255, 255, 255));
        cajaResultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cajaResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Calculadora Grafica");
        lblMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSumar.setBackground(new java.awt.Color(255, 255, 255));
        btnSumar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(0, 0, 0));
        btnSumar.setText("Sumar");
        btnSumar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(255, 255, 255));
        btnRestar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(0, 0, 0));
        btnRestar.setText("Restar");
        btnRestar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(0, 0, 0));
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(255, 255, 255));
        btnDividir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(0, 0, 0));
        btnDividir.setText("Dividir");
        btnDividir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnVaciar.setBackground(new java.awt.Color(255, 255, 255));
        btnVaciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(0, 0, 0));
        btnVaciar.setText("Vaciar");
        btnVaciar.setToolTipText("");
        btnVaciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVaciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVaciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumero1)
                                    .addComponent(lblNumero2))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaNumero2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaNumero1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(lblNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(lblNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRestar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(btnSumar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        barraMenu.setBackground(new java.awt.Color(255, 255, 255));
        barraMenu.setForeground(new java.awt.Color(0, 0, 0));
        barraMenu.setText("Menu");
        barraMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        barraMenu.add(salir);

        jMenuBar1.add(barraMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed


    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed

        if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero1.setText(numero);
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique los datos");

        } else if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText() != null) {
            this.cajaNumero1.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el primer dato");

        } else if (this.cajaNumero1.getText() != null && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el segundo dato");

        } else {
            double suma = aritmetica.sumar(Double.parseDouble(this.cajaNumero1.getText()), Double.parseDouble(this.cajaNumero2.getText()));
            String resultado = Double.toString(suma);
            this.cajaResultado.setText(resultado);
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed

        if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero1.setText(numero);
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique los datos");

        } else if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText() != null) {
            this.cajaNumero1.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el primer dato");

        } else if (this.cajaNumero1.getText() != null && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el segundo dato");

        } else {
            double resta = aritmetica.restar(Double.parseDouble(this.cajaNumero1.getText()), Double.parseDouble(this.cajaNumero2.getText()));
            String resultado = Double.toString(resta);
            this.cajaResultado.setText(resultado);
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed

        if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero1.setText(numero);
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique los datos");

        } else if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText() != null) {
            this.cajaNumero1.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el primer dato");

        } else if (this.cajaNumero1.getText() != null && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el segundo dato");

        } else {
            double multiplicacion = aritmetica.multiplicar(Double.parseDouble(this.cajaNumero1.getText()), Double.parseDouble(this.cajaNumero2.getText()));
            String resultado = Double.toString(multiplicacion);
            this.cajaResultado.setText(resultado);
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed

        if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero1.setText(numero);
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique los datos");

        } else if (this.cajaNumero1.getText().equals("") && this.cajaNumero2.getText() != null) {
            this.cajaNumero1.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el primer dato");

        } else if (this.cajaNumero1.getText() != null && this.cajaNumero2.getText().equals("")) {
            this.cajaNumero2.setText(numero);
            JOptionPane.showMessageDialog(null, "Verifique el segundo dato");

        } else {
            double division = aritmetica.dividir(Double.parseDouble(this.cajaNumero1.getText()), Double.parseDouble(this.cajaNumero2.getText()));
            String resultado = Double.toString(division);
            this.cajaResultado.setText(resultado);
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        this.cajaNumero1.setText("");
        this.cajaNumero2.setText("");
        this.cajaResultado.setText("");
    }//GEN-LAST:event_btnVaciarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu barraMenu;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JTextField cajaNumero1;
    private javax.swing.JTextField cajaNumero2;
    private javax.swing.JTextField cajaResultado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
