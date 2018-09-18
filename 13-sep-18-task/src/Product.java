/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhinav
 */
public class Product {
    private int pcode;
    private String pname;
    private String brand;
    private int price;

    public Product(int pcode, String pname, String brand, int price) {
        this.pcode = pcode;
        this.pname = pname;
        this.brand = brand;
        this.price = price;
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "pcode=" + pcode + ", pname=" + pname + ", brand=" + brand + ", price=" + price + '}';
    }

    
    
}
