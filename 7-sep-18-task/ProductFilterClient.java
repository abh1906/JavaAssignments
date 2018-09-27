
import java.io.*;
import java.util.ArrayList;
public class ProductFilterClient{
    public static void main(String args[]){
        ArrayList <Product> list=new ArrayList<>();
        list.add(new Product(101,"tea","brookebond",100,20));
        list.add(new Product(102,"Nescafe","Nestle",100,20));
        list.add(new Product(103,"colgate","palmolive",100,20));
        list.add(new Product(104,"closeup","unilever",100,20));
        list.add(new Product(105,"A3","Audi",10000000,20));
        list.add(new Product(106,"FZ","Ferrari",10000000,20));
        list.add(new Product(107,"Activa","Honda",55000,20));
        list.add(new Product(108,"Maestro","Hero",60000,20));
        list.add(new Product(109,"Baleno","Nexa",500000,20));
        list.add(new Product(110,"Fzs","Suzuki",850000,20));
        list.add(new Product(111,"city","Honda",550000,10));
       ProductFilter pf=new ProductFilter();
       System.out.println("search by brand");
       pf.searchBybrand(list,"Honda");

       System.out.println("search by product name");
       pf.searchBypname(list,"maestro");

       System.out.println("search by price");
       pf.searchByprice(list,55000);

       System.out.println("Filter by price");
       pf.filterByprice(list,"Honda");

       System.out.println("Filter by quantity");
       pf.filterByquantity(list,"Honda");


    }
}