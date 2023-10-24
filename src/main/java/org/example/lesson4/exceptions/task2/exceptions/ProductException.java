package org.example.lesson4.exceptions.task2.exceptions;

public class ProductException extends Exception{
    String name;

    public ProductException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
