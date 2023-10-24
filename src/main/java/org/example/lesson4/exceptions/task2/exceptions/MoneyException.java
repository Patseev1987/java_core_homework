package org.example.lesson4.exceptions.task2.exceptions;

public class MoneyException extends Exception{
    int money;
    int  amountMoneyWhichNeed;
    String customerName;

    String productName;

    public int getMoney() {
        return money;
    }

    public MoneyException(int money, int amountMoneyWhichNeed, String customerName, String productName) {
        this.money = money;
        this.amountMoneyWhichNeed = amountMoneyWhichNeed;
        this.customerName = customerName;
        this.productName = productName;
    }

    public int getAmountMoneyWhichNeed() {
        return amountMoneyWhichNeed;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }
}
