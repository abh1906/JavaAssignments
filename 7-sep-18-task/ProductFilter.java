import java.util.*;
public class ProductFilter{

    public void searchBypname(ArrayList<Product> list,String pname){
        for(Product pro:list){
            if(pro.getpName().equalsIgnoreCase(pname)){
                System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
            }
             
        }


    }
    public void searchBybrand(ArrayList<Product> list,String brand){
        for(Product pro:list){
            if(pro.getBrand().equalsIgnoreCase(brand)){
                System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
            }
            }
        }
    public void searchByprice(ArrayList<Product> list,int price){
        for(Product pro:list){
            if(pro.getPrice()==price){
                System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
   
            }
   
    
        }
        }
    public void filterByprice(ArrayList<Product> list,String brand){
        Collections.sort(list, new Comparator<Product>() 
        {
            public int compare(Product a,Product b){
                if((a.getPrice()<=b.getPrice()))
                return -1;
                else
                 return 1;
            }
        });
        for(Product pro:list){
            if(pro.getBrand().equalsIgnoreCase(brand))
            System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
   
        }
    
    }
    public void filterByquantity(ArrayList<Product> list,String brand){
        Collections.sort(list, new Comparator<Product>() 
        {
            public int compare(Product a,Product b){
                if((a.getQuantity()<=b.getQuantity()))
                return -1;
                else
                 return 1;
            }
        });
        for(Product pro:list){
            if(pro.getBrand().equalsIgnoreCase(brand))
            System.out.println("ProductCode:"+pro.getpCode()+" "+"Productname:"+pro.getpName()+" "+"Brand:"+pro.getBrand()+" "+"Quantity:"+pro.getQuantity()+" "+"Price:"+pro.getPrice());
   
        }
    }
    

    
}