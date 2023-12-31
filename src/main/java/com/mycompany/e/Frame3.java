/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.e;

/**
 *
 * @author edmon
 */
public class Frame3 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame3() {
        initComponents();
    }
    //Custom method to calculate the average of two double numbers.
    static double average(double num1, double num2) {
        return (num1 + num2)/2;
    }
    //Custom method to calculate the sum of two double numbers.
    static double sum(double num1, double num2) {
        return Math.addExact((int) num1, (int) num2);
    }
    //Custom method to calculate the subtraction of two double numbers.
    static double subtraction(double num1, double num2) {
        return Math.subtractExact((int) num1, (int) num2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSwitchtoFrame1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtnumber1 = new javax.swing.JTextField();
        txtnumber2 = new javax.swing.JTextField();
        btncalculatesum = new javax.swing.JButton();
        btncalculateaverage = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        txtresult = new javax.swing.JTextField();
        txtamountleft = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonSwitchtoFrame1.setText("Back to previous page");
        ButtonSwitchtoFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSwitchtoFrame1ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl1.setText("Average,Total Value, and Amount left Calculator");

        lbl2.setText("Enter First Amount:");

        lbl3.setText("Enter Second Amount:");

        btncalculatesum.setText("Calculate Sum");
        btncalculatesum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculatesumActionPerformed(evt);
            }
        });

        btncalculateaverage.setText("Calculate Average");
        btncalculateaverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateaverageActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        lbl4.setText("Result for either Sum, Average, or the Amount left");

        txtresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultActionPerformed(evt);
            }
        });

        txtamountleft.setText("Calculate Amount left");
        txtamountleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountleftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSwitchtoFrame1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnexit)
                        .addGap(57, 57, 57)
                        .addComponent(lbl4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btncalculatesum, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncalculateaverage))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtamountleft)
                                .addGap(14, 14, 14))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txtnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncalculateaverage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncalculatesum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txtnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtamountleft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSwitchtoFrame1)
                    .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Action for the "Back to previous page" button.
    private void ButtonSwitchtoFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSwitchtoFrame1ActionPerformed
        U1A1_EdmondLiang myFrame3 = new U1A1_EdmondLiang();
        myFrame3.setVisible((true));
        this.dispose(); // Close the current JFrame.
    }//GEN-LAST:event_ButtonSwitchtoFrame1ActionPerformed

    // Action for the "Calculate Sum" button.
    private void btncalculatesumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculatesumActionPerformed
        // TODO add your handling code here:
        try {
            double num1 = Double.parseDouble(txtnumber1.getText()); // Parse the text from a JTextField to a double.
            double num2 = Double.parseDouble(txtnumber2.getText());
            txtresult.setText("Sum: " + sum(num1, num2)); // Display the sum in a TextField.
    }   catch (NumberFormatException e) {
            txtresult.setText("Invalid input. Please enter valid numbers."); // Handle invalid input.
    }
    }//GEN-LAST:event_btncalculatesumActionPerformed
    
    private void txtresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresultActionPerformed
   
    // Action for the "Calculate Average" button.
    private void btncalculateaverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateaverageActionPerformed
        // TODO add your handling code here:
        try {
            double num1 = Double.parseDouble(txtnumber1.getText()); // Parse the text from a JTextField to a double.
            double num2 = Double.parseDouble(txtnumber2.getText());
            txtresult.setText("Average: " + average(num1, num2)); // Display the sum in a TextField.
    }   catch (NumberFormatException e) {
            txtresult.setText("Invalid input. Please enter valid numbers."); // Handle invalid input.
    }
    }//GEN-LAST:event_btncalculateaverageActionPerformed
    
    
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        //Closes the program
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    // Action for the "Calculate Amount left" button.
    private void txtamountleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountleftActionPerformed
        // TODO add your handling code here:
        try {
            double num1 = Double.parseDouble(txtnumber1.getText()); // Parse the text from a JTextField to a double.
            double num2 = Double.parseDouble(txtnumber2.getText());
            txtresult.setText("Amount left: " + subtraction(num1, num2)); // Display the sum in a TextField.
    } catch (NumberFormatException e) {
            txtresult.setText("Invalid input. Please enter valid numbers."); // Handle invalid input.
    }//GEN-LAST:event_txtamountleftActionPerformed
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSwitchtoFrame1;
    private javax.swing.JButton btncalculateaverage;
    private javax.swing.JButton btncalculatesum;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JButton txtamountleft;
    private javax.swing.JTextField txtnumber1;
    private javax.swing.JTextField txtnumber2;
    private javax.swing.JTextField txtresult;
    // End of variables declaration//GEN-END:variables
}
