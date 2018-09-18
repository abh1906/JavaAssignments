
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
 * @author Abhinav
 */
public class ProjectDetails extends java.awt.Frame {

    /**
     * Creates new form ProjectDetails
     */
    public ProjectDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        eno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ptitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jLabel1.setText("ENO.");
        add(jLabel1);
        jLabel1.setBounds(60, 50, 60, 14);
        add(eno);
        eno.setBounds(200, 50, 150, 20);

        jLabel2.setText("Ptitle");
        add(jLabel2);
        jLabel2.setBounds(60, 110, 50, 14);

        ptitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptitleActionPerformed(evt);
            }
        });
        add(ptitle);
        ptitle.setBounds(200, 110, 150, 20);

        jLabel3.setText("Cname");
        add(jLabel3);
        jLabel3.setBounds(60, 180, 70, 14);
        add(cname);
        cname.setBounds(200, 170, 150, 20);

        jButton1.setText("GET DETAILS");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(170, 230, 160, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void ptitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptitleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int en=Integer.parseInt(eno.getText());
            // TODO add your handling code here:
            Connection con=OracleConnect.getConnnect();
            String sql="select p.ptitle,c.cname from emp e,project p,clients c where e.pcode=p.pcode and p.ccode=c.ccode and e.eno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, en);
            ResultSet rs=ps.executeQuery();
            rs.next();
            ptitle.setText(rs.getString(1));
            cname.setText((rs.getString(2)));
            rs.close();
            ps.close();
            con.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectDetails().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cname;
    private javax.swing.JTextField eno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField ptitle;
    // End of variables declaration//GEN-END:variables
}