/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;

/**
 *
 * @author Abhinav
 */
public class Registration2 extends java.awt.Frame {

    /**
     * Creates new form Registration2
     */
    public Registration2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new java.awt.Label();
        l2 = new java.awt.Label();
        l3 = new java.awt.Label();
        tf1 = new java.awt.TextField();
        tf2 = new java.awt.TextField();
        tf3 = new java.awt.TextField();
        button1 = new java.awt.Button();

        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        l1.setText("Name");
        add(l1);
        l1.setBounds(30, 70, 38, 20);
        l1.getAccessibleContext().setAccessibleName("Name");

        l2.setText("Age");
        add(l2);
        l2.setBounds(30, 160, 25, 20);

        l3.setText("RollNo");
        add(l3);
        l3.setBounds(30, 260, 42, 20);

        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
        add(tf1);
        tf1.setBounds(200, 70, 160, 20);

        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf2FocusLost(evt);
            }
        });
        add(tf2);
        tf2.setBounds(200, 160, 160, 20);

        tf3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf3FocusLost(evt);
            }
        });
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        add(tf3);
        tf3.setBounds(200, 260, 160, 20);

        button1.setLabel("SUBMIT");
        add(button1);
        button1.setBounds(180, 350, 60, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
        tf1.setBackground(Color.green);
    }//GEN-LAST:event_tf1FocusGained

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        tf1.setBackground(Color.white);
    }//GEN-LAST:event_tf1FocusLost

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        // TODO add your handling code here:
         tf2.setBackground(Color.green);
    }//GEN-LAST:event_tf2FocusGained

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        tf2.setBackground(Color.white);
    }//GEN-LAST:event_tf2FocusLost

    private void tf3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusGained
        // TODO add your handling code here:
        tf3.setBackground(Color.green);
    }//GEN-LAST:event_tf3FocusGained

    private void tf3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusLost
        // TODO add your handling code here:
         tf3.setBackground(Color.white);
    }//GEN-LAST:event_tf3FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration2().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Label l1;
    private java.awt.Label l2;
    private java.awt.Label l3;
    private java.awt.TextField tf1;
    private java.awt.TextField tf2;
    private java.awt.TextField tf3;
    // End of variables declaration//GEN-END:variables
}
