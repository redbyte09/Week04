package com.smartmanagmentsyastem;

public abstract class WarehouseItem {

    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name=name;
        this.price=price;
    }

    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public abstract void  display();

}
