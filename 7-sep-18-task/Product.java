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
    
    private int pCode;
    private String pName;
    private String brand;
    private int price;
    private int quantity;

    public Product(int pCode, String pName, String brand, int price, int quantity) {
        this.pCode = pCode;
        this.pName = pName;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public int getpCode() {
        return pCode;
    }

    public void setpCode(int pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        Product o=(Product)obj;
        if(pCode>o.pCode)
            return true;
        else
            return false;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return 1; //To change body of generated methods, choose Tools | Templates.
    }
    
}
