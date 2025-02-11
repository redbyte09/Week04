package com.dynamiconlinemarketplace;
class Product<T> {
    private String name;
    private double price;
    private T category;


    public Product(String name, double price, T category) {
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public T getCategory(){
        return category;
    }
    public void setCategory(T category){
        this.category=category;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Product name is "+getName());
        System.out.println("Product price is "+getPrice());
        System.out.println("Product category is "+getCategory());

    }

}
