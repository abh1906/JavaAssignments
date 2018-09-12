/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;

/**
 *
 * @author Abhinav
 */
public class ProductClient {
    public static void main(String args[]){
        HashSet <Product> list=new HashSet<>();
        long start=System.nanoTime();
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
        long end=System.nanoTime();
        System.out.print("Time elapsed:"+(end-start));
        
    }
    
}
