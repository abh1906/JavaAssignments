

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhinav
 */
public class ProductService {
    Connection con;
    PreparedStatement ps;
    public ProductService() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","aj","abh12345");
       }
    public void insertProduct(int pcode,String pname,int price,String brand) throws SQLException{
        ps=con.prepareStatement("insert into productt values(?,?,?,?)");
        ps.setInt(1, pcode);
        ps.setString(2,pname);
        ps.setInt(3, price);
        ps.setString(4, brand);
        ps.executeUpdate();
        System.out.println("one row inserted");
}

   public void updateProduct(int pcode,String pname,int price,String brand) throws SQLException{
       ps=con.prepareStatement("update  productt values set pname=?,price=?,brand=? where pcode=?");
        ps.setString(1, pname);
        ps.setInt(2,price);
        ps.setString(3,brand);
        ps.setInt(4, pcode);
        ps.executeUpdate();
        System.out.println("one row updated");
        
}
   public void deleteProduct(int pcode) throws SQLException{
        ps=con.prepareStatement("delete from productt where pcode=?");
        ps.setInt(1, pcode);
        ps.executeUpdate();
        System.out.print("one row deleted");
   }
   
   public Product searchProduct(int pcode) throws SQLException{
        ps=con.prepareStatement("select * from productt where pcode=?");
        ps.setInt(1, pcode);
        ResultSet rs=ps.executeQuery();
        rs.next();
       return new Product(rs.getInt(1),rs.getString(2),rs.getString(4),rs.getInt(3));
       
   }
   public ArrayList<Product> searchBybrand(String brand) throws SQLException{
       ArrayList <Product> list=new ArrayList<>();
       ps=con.prepareStatement("select * from productt where brand=?");
       ps.setString(1, brand);
       ResultSet rs=ps.executeQuery();
       while(rs.next()){
           list.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(4),rs.getInt(3)));
       }
       
       return list;
   }
  }
