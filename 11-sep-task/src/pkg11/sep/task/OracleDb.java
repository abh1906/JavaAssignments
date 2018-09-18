/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.sep.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Abhinav
 */
class OracleDb{
static Connection con;
    public static Connection getConnnect() throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","aj","abh12345");
        return con;
        
    }
    public static void main(String args[]) throws SQLException, ClassNotFoundException{
        System.out.println(OracleDb.getConnnect());
    }
}
