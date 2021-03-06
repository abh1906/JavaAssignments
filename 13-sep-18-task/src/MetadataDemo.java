
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
public class MetadataDemo extends java.awt.Frame {
String schema;
String password;
    /**
     * Creates new form MetadataDemo
     */
    public MetadataDemo() {
        initComponents();
        c1.add("worldpay");
        c1.add("aj");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new java.awt.Choice();
        t1 = new java.awt.TextArea();
        label1 = new java.awt.Label();
        c2 = new java.awt.Choice();
        label2 = new java.awt.Label();

        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        add(c1);
        c1.setBounds(160, 40, 140, 20);
        add(t1);
        t1.setBounds(120, 180, 230, 80);

        label1.setText("SCHEMA");
        add(label1);
        label1.setBounds(50, 40, 70, 20);

        c2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c2ItemStateChanged(evt);
            }
        });
        add(c2);
        c2.setBounds(160, 100, 150, 20);

        label2.setText("TABLES");
        add(label2);
        label2.setBounds(50, 100, 60, 20);

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
             schema=c1.getSelectedItem();
             password="";
            if(schema.equals("worldpay"))
                password="wp";
            else
                password="abh12345";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",schema,password);
            PreparedStatement ps=con.prepareStatement("select tname from tab");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                c2.add(rs.getString(1));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MetadataDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MetadataDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_c1ItemStateChanged

    private void c2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c2ItemStateChanged
        // TODO add your handling code here:
        String table=c2.getSelectedItem();
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",schema,password);
            PreparedStatement ps=con.prepareStatement("select * from ?");
            ps.setString(1, table);
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsd=rs.getMetaData();
            int n =rsd.getColumnCount();
            while(rs.next()){
                for(int i=1;i<=n;i++){
                    t1.append(rs.getString(i)+" ");
                }
                t1.append("\n");
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MetadataDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MetadataDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_c2ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetadataDemo().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice c1;
    private java.awt.Choice c2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextArea t1;
    // End of variables declaration//GEN-END:variables
}
