package org.example.lesson4.exceptions.task2;

public class Order {
    private  static int id;
    private int idOrder;
    private Product product;
    private Customer customer;
    private int count;

    public Order( Product product, Customer customer, int count) {
        idOrder=++id;
        this.product = product;
        this.customer = customer;
        this.count = count;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public static int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Order  ---  " +
                "id = " + idOrder +
                ", " + product +
                ", count = " + count +
                ", " + customer;
    }
}
