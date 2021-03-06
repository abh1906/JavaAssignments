
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
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
public class TaxClient extends java.awt.Frame {

    /**
     * Creates new form TaxClient
     */
    public TaxClient() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pcode = new javax.swing.JTextField();
        stx = new javax.swing.JTextField();
        etx = new javax.swing.JTextField();
        vtx = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jLabel1.setText("PCODE");
        add(jLabel1);
        jLabel1.setBounds(70, 60, 70, 14);

        jLabel2.setText("SALESTAX");
        add(jLabel2);
        jLabel2.setBounds(70, 110, 70, 14);

        jLabel3.setText("EXCISE TAX");
        add(jLabel3);
        jLabel3.setBounds(70, 150, 70, 14);

        jLabel4.setText("VAT");
        add(jLabel4);
        jLabel4.setBounds(70, 190, 60, 14);

        jLabel5.setText("TOTAL");
        add(jLabel5);
        jLabel5.setBounds(70, 230, 70, 14);

        pcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcodeActionPerformed(evt);
            }
        });
        add(pcode);
        pcode.setBounds(210, 50, 190, 20);

        stx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stxActionPerformed(evt);
            }
        });
        add(stx);
        stx.setBounds(210, 100, 190, 20);
        add(etx);
        etx.setBounds(210, 150, 190, 20);
        add(vtx);
        vtx.setBounds(210, 190, 190, 20);
        add(total);
        total.setBounds(210, 230, 190, 20);

        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(200, 270, 140, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void pcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcodeActionPerformed

    private void stxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            int pcod=Integer.parseInt(pcode.getText());
            Connection con=OracleConnect.getConnnect();
            PreparedStatement ps=con.prepareStatement("select price from product where pcode=?");
            ps.setInt(1, pcod);
            ResultSet rs=ps.executeQuery();
            rs.next();
            double price=rs.getDouble((1));
            ps.close();
            
            CallableStatement cs=con.prepareCall("{call cal_tax(?,?,?,?)}");
            cs.setInt(1,pcod);
            cs.registerOutParameter(2,Types.DOUBLE);
            cs.registerOutParameter(3,Types.DOUBLE);
            cs.registerOutParameter(4,Types.DOUBLE);
            cs.execute();
            double sal_tx=cs.getDouble(2);
            double vat_tx=cs.getDouble(3);
            double ex_tx=cs.getDouble(4);
            stx.setText(""+sal_tx);
            vtx.setText(""+vat_tx);
            etx.setText(""+ex_tx);
            double totl=price+sal_tx+vat_tx+ex_tx;
            total.setText(""+totl);
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TaxClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TaxClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxClient().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField etx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pcode;
    private javax.swing.JTextField stx;
    private javax.swing.JTextField total;
    private javax.swing.JTextField vtx;
    // End of variables declaration//GEN-END:variables
}
