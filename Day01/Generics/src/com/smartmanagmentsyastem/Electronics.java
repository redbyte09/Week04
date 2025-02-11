package com.smartmanagmentsyastem;

public class Electronics extends WarehouseItem {

    private String brand;
    public Electronics(String name, double price, String brand) {
        super(name,price);
        this.brand=brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public void display(){
        System.out.println("Name of electronics"+getName());
        System.out.println("Price of electronics"+getPrice());
        System.out.println("Brand of electronics"+getBrand());

    }
}
