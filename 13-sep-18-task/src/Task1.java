
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Task1 extends java.awt.Frame {
ResultSet rs;
    /**
     * Creates new form Task1
     */
    public Task1() throws ClassNotFoundException, SQLException {
        initComponents();
      
        EmployeeDb conn=new EmployeeDb();  
       Connection con=conn.getCon();
       PreparedStatement ps=con.prepareStatement("select * from edata ",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      
        rs=ps.executeQuery();
       rs.next();
       eno.setText(rs.getString(1));
        ename.setText(rs.getString(2));
        sal.setText(rs.getString(3));
       
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eno = new javax.swing.JTextField();
        ename = new javax.swing.JTextField();
        sal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jLabel1.setText("Eno");
        add(jLabel1);
        jLabel1.setBounds(20, 40, 60, 14);

        jLabel2.setText("Ename");
        add(jLabel2);
        jLabel2.setBounds(20, 90, 32, 14);

        jLabel3.setText("Salary");
        add(jLabel3);
        jLabel3.setBounds(20, 160, 30, 14);

        eno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enoActionPerformed(evt);
            }
        });
        add(eno);
        eno.setBounds(160, 40, 190, 20);
        add(ename);
        ename.setBounds(160, 90, 190, 20);
        add(sal);
        sal.setBounds(160, 160, 190, 20);

        jButton1.setText("First");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 230, 110, 23);

        jButton2.setText("next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(130, 230, 90, 23);

        jButton3.setText("Previous");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(233, 230, 120, 23);

        jButton4.setText("last");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(380, 230, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void enoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        // TODO add your handling code here:
        if(rs.first()==true){
        eno.setText(rs.getString(1));
        ename.setText(rs.getString(2));
        sal.setText(rs.getString(3));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
        // TODO add your handling code here:
        if(rs.last()==true){
        eno.setText(rs.getString(1));
        ename.setText(rs.getString(2));
        sal.setText(rs.getString(3));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
        // TODO add your handling code here:
        if(rs.next()==true){
        eno.setText(rs.getString(1));
        ename.setText(rs.getString(2));
        sal.setText(rs.getString(3));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
        // TODO add your handling code here:
        if(rs.previous()==true){
        eno.setText(rs.getString(1));
        ename.setText(rs.getString(2));
        sal.setText(rs.getString(3));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Task1().setVisible(true);
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ename;
    private javax.swing.JTextField eno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sal;
    // End of variables declaration//GEN-END:variables
}
