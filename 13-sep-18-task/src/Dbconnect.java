
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class Dbconnect {
   File filename;
   String dbname;
   String username;
   String password;
   String url;
   String driver;
   public Dbconnect(File filename) throws IOException{
       FileInputStream fin=null;
       try {
           this.filename=filename;
           fin = new FileInputStream(filename);
           byte b[]=new byte[fin.available()];
           fin.read(b);
           String ar=new String(b);
           String conf[]=ar.split(",");
           driver=conf[0];
           url=conf[1];dbname=conf[2];
           username=conf[3];
           password=conf[4];
          System.out.println(url+dbname+username+password);
           
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Dbconnect.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
           try {
               fin.close();
           } catch (IOException ex) {
               Logger.getLogger(Dbconnect.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }
   public Connection getConnection() throws ClassNotFoundException, SQLException{
       
           Class.forName(driver);
           Connection con=DriverManager.getConnection(url+dbname,username,password);
           return con;
           
    }
   public String getDatabaseType(){
      if(driver.equals("com.mysql.jdbc.Driver"))
          return "mysql";
      else
          return "oracle";
   }
   public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException{
       Dbconnect con=new Dbconnect(new File("C:\\Users\\Abhinav\\Desktop\\abhinav_java\\13-sep-18-task\\src\\connection"));
       System.out.println(con);
   }
    
}
