package org.example.lesson3;

public class Director extends Employee{
    public Director(String name, String lastname, String patronymic, String post, String telNumber, int salary, int age) {
        super(name, lastname, patronymic, post, telNumber, salary, age);
    }

    public static void increaseSalary (Employee[] employees, int amountIncrease, int age){
        for (Employee employee:employees) {
            if(employee.getAge()>=age && !(employee instanceof Director)){
                employee.setSalary(employee.getSalary()+amountIncrease);
            }
        }
    }


}
