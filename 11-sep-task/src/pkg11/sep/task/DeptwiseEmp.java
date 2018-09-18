/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.sep.task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhinav
 */
public class DeptwiseEmp extends java.awt.Frame {

    /**
     * Creates new form DeptwiseEmp
     */
    public DeptwiseEmp() throws SQLException, ClassNotFoundException {
        initComponents();
        Connection con=OracleDb.getConnnect();
        PreparedStatement ps=con.prepareStatement("select dnmame from dept");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            c1.add(rs.getString(1));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextArea();
        c1 = new java.awt.Choice();
        label1 = new java.awt.Label();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        t1.setColumns(20);
        t1.setRows(5);
        jScrollPane1.setViewportView(t1);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 340, 96);

        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        add(c1);
        c1.setBounds(220, 30, 120, 20);

        label1.setText("SELECT DEPARTMENT");
        add(label1);
        label1.setBounds(40, 30, 135, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        try {
            // TODO add your handling code here:
            String dname=c1.getSelectedItem();
            Connection con=OracleDb.getConnnect();
            PreparedStatement ps=con.prepareStatement("select * from empp where deptno=(select deptno from dept where dnmame=?)");
            ps.setString(1, dname);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                t1.setText(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeptwiseEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeptwiseEmp.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_c1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeptwiseEmp().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DeptwiseEmp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DeptwiseEmp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice c1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextArea t1;
    // End of variables declaration//GEN-END:variables
}