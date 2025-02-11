package com.smartmanagmentsyastem;

public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name,double price,String material){
        super(name,price);
        this.material=material;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public String getMaterial(){
        return this.material;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Price: "+getPrice());
        System.out.println("Material: "+getMaterial());
    }
}
