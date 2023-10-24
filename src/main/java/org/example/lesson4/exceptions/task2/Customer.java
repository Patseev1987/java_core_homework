package org.example.lesson4.exceptions.task2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
   private String name;
   private int amountMoney;


    public Customer(String name, int amountMoney) {
        this.name = name;
        this.amountMoney = amountMoney;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }


    @Override
    public String toString() {
        return "Customer: " +
                 name;
    }
}
