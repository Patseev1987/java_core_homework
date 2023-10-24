package org.example.lesson4.exceptions.task2.exceptions;

public class NegativeCounterException extends Exception{
    int counter;

    public NegativeCounterException(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}
