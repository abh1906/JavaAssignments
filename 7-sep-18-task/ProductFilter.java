import java.util.*;
public class ProductFilter{

    public void searchBypname(HashSet<Product> list,String pname){
        for(Product pro:list){
            if(pro.getpName().equalsIgnoreCase(pname)){
                System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
            }
             
        }


    }
    public void searchBybrand(HashSet<Product> list,String brand){
        for(Product pro:list){
            if(pro.getBrand().equalsIgnoreCase(brand)){
                System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
   
            }
    public void searchByprice(HashSet<Product> list,int price){
        for(Product pro:list){
            if(pro.getPrice()==price){
                System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
   
            }
    }
        }
    }
}