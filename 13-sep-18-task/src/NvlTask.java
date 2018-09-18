
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
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
 * @author Abhinav
 */
public class NvlTask {
    public static void main(String args[]) throws IOException, SQLException, ClassNotFoundException{
        File file=new File(args[0]);
        Dbconnect con=new Dbconnect(file);
        Connection conn=con.getConnection();
        PreparedStatement ps;
        if(con.getDatabaseType().equals("mysql")){
           ps =conn.prepareStatement("select sal from edata");
            
        }
        else
            ps=conn.prepareStatement("Select nvl(sal,0) from edata");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        conn.close();
    }
    
}
