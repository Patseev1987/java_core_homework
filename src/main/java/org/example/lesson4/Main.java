package org.example.lesson4;

import org.example.lesson4.exceptions.WrongLoginException;
import org.example.lesson4.exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Authorization.checkUserPassword("Boris","123321123","1233211123"));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
