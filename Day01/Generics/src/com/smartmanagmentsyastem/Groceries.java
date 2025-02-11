package com.smartmanagmentsyastem;

public class Groceries extends WarehouseItem{
    private String type;

    public Groceries(String name,double price,String type){
        super(name,price);
        this.type=type;

    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }

    public void display(){
        System.out.println("Name of item: "+getName());
        System.out.println("Price of item: "+getPrice());
        System.out.println("Type: "+getType());
    }
}
