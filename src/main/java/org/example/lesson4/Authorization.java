package org.example.lesson4;

import org.example.lesson4.exceptions.WrongLoginException;
import org.example.lesson4.exceptions.WrongPasswordException;

public class Authorization {
    public static boolean checkUserPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20)
            throw new WrongLoginException("Login is more than 20 symbols.");
        if (password.length() > 20)
            throw new WrongPasswordException("Password is more then 20 symbols.");
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
