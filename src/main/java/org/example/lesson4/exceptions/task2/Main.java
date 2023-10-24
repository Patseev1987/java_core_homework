package org.example.lesson4.exceptions.task2;

import org.example.lesson4.exceptions.task2.exceptions.CustomerException;
import org.example.lesson4.exceptions.task2.exceptions.MoneyException;
import org.example.lesson4.exceptions.task2.exceptions.NegativeCounterException;
import org.example.lesson4.exceptions.task2.exceptions.ProductException;

import java.util.Random;

public class Main {
    private static Product[] products = new Product[5];
    private static Customer[] customers = new Customer[5];
    private static Order[] orders = new Order[5];

    private static String[] randomCustomerNames = new String[7];
    private static String[] randomProductNames = new String[7];

    private static Random random = new Random();

    static {
        products[0] = new Product("Oranges",100);
        products[1] = new Product("Apples",80);
        products[2] = new Product("Nuts",600);
        products[3] = new Product("Chocolate",150);
        products[4] = new Product("Water",50);

        customers[0] = new Customer("Boris",1500);
        customers[1] = new Customer("John",300);
        customers[2] = new Customer("Nikola",3500);
        customers[3] = new Customer("Rich",100);
        customers[4] = new Customer("Poul",500);

        randomCustomerNames[0] = "Boris";
        randomCustomerNames[1] = "John";
        randomCustomerNames[2] = "Nikola";
        randomCustomerNames[3] = "Rich";
        randomCustomerNames[4] = "Poul";
        randomCustomerNames[5] = "Uri";
        randomCustomerNames[6] = "Ivan";

        randomProductNames[0] = "Oranges";
        randomProductNames[1] = "Apples";
        randomProductNames[2] = "Nuts";
        randomProductNames[3] = "Chocolate";
        randomProductNames[4] = "Water";
        randomProductNames[5] = "Bread";
        randomProductNames[6] = "Chery";

    }

    public static void main(String[] args) {

        Order[] orders = new Order[5];
        int counter = 0;
        while (counter < orders.length) {
            try{
                orders[counter] = makePurchase(randomProductNames[random.nextInt(randomProductNames.length)]
                        ,randomCustomerNames[random.nextInt(randomCustomerNames.length)]
                        ,random.nextInt(5)-1,customers,products );
                counter++;
            } catch (CustomerException e) {
                System.out.printf("Customer with name %s doesn't exist!\n",e.getName());
            } catch (MoneyException e) {
                System.out.printf("Customer %s doesn't have enough money for %s.\nThey have %d but need %d\n"
                        ,e.getCustomerName(),e.getProductName(),e.getMoney(),e.getAmountMoneyWhichNeed());
            } catch (NegativeCounterException e) {
                System.out.printf("Product count can't be negative.\nYou entered %d\n",e.getCounter());
            } catch (ProductException e) {
                System.out.printf("Product with name %s doesn't exist!\n",e.getName());
            }

        }

        for (Order order:orders) {
            System.out.println(order+"\n");
        }

    }

    public static Customer getCustomer(Customer[] customers, String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName))
                return customer;
        }
        return null;
    }

    public static Product getProduct(Product[] products, String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName))
                return product;
        }
        return null;
    }

    public static Order makePurchase(String productName, String customerName,
                                     int count, Customer[] customers,
                                     Product[] products) throws NegativeCounterException, CustomerException, ProductException, MoneyException {

        if (count < 0) {
            throw new NegativeCounterException(count);
        }
        Customer tempCustomer = getCustomer(customers, customerName);
        if (tempCustomer == null) {
            throw new CustomerException(customerName);
        }
        Product tempProduct = getProduct(products, productName);
        if (tempProduct == null) {
            throw new ProductException(productName);
        }

        if (tempCustomer.getAmountMoney() < tempProduct.getPrice() * count) {
            throw new MoneyException(tempCustomer.getAmountMoney(), tempProduct.getPrice() * count,tempCustomer.getName(),tempProduct.getName());
        } else {
            tempCustomer.setAmountMoney(tempCustomer.getAmountMoney() - tempProduct.getPrice() * count);
        }
        return new Order(tempProduct, tempCustomer, count);
    }

}
