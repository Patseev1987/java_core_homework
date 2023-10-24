package org.example.lesson4.exceptions.task2;

public class Product {
  private  String name;
   private int price;

    public Product(String name , int price) {
        if(name==null){
            throw new RuntimeException("Name product can't be null");
        }else {
            this.name = name;
        }
        if(price>=0) {
            this.price = price;
        } else{
            throw new RuntimeException("Price product can't be lower than 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                name +
                ", price= " + price;
    }
}
