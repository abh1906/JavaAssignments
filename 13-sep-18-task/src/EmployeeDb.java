
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class EmployeeDb {
    
   Connection con;
   public EmployeeDb() throws ClassNotFoundException, SQLException{
       Class.forName("oracle.jdbc.driver.OracleDriver");
      con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","aj","abh12345");
      
   }
   public Connection getCon(){
       return con;
   }
   
   public static void main(String args[]) throws ClassNotFoundException, SQLException{
       EmployeeDb obj=new EmployeeDb();
       System.out.print(obj.con);
   }
   
   
}
