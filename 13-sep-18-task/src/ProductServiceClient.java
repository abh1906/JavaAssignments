
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
public class ProductServiceClient {
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        ProductService ps=new ProductService();
        ps.insertProduct(7,"cookies", 10,"parleG");
        Product pro=ps.searchProduct(1);
        System.out.println(pro);
        ps.deleteProduct(5);
        ArrayList<Product> list=ps.searchBybrand("parleG");
        for(Product tmp:list){
            System.out.println(tmp);
            
        }
        
    }
    
}
