package org.example.lesson3;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String name;
    private String lastname;
    private String patronymic;
    private String post;
    private String telNumber;
    private int salary;
    private int age;

    public Employee(String name, String lastname, String patronymic, String post, String telNumber, int salary, int age) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.post = post;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", post='" + post + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void info(){
        this.toString();
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPost() {
        return post;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

   private static void increaseSalary (Employee[] employees, int amountIncrease, int age){
        for (Employee employee:employees) {
            if(employee.getAge()>=age){
                employee.setSalary(employee.getSalary()+amountIncrease);
            }
        }
    }

    public static void averageAge (Employee[] employees){
        double result=0;
        for (Employee emp:employees) {
            result+= emp.getAge();
        }
        result=(double) result/ employees.length;
        System.out.printf("Average age in company is %.1f years\n",result);

    }

    public static void averageSalary (Employee[] employees){
        double result=0;
        for (Employee emp:employees) {
            result+= emp.getSalary();
        }
        result=(double) result/ employees.length;
        System.out.printf("Average salary in company is %.2f rub\n",result);
    }




    public static long compareTwoDate (int date1Year, int date1Month, int date1Day
            , int date2Year, int date2Month, int date2Day) {
        Date date1 = new Date(date1Year,date1Month,date1Day);
        long date1InLongFormat = date1.getTime();
        Date date2 = new Date(date2Year,date2Month,date2Day);
        long date2InLongFormat = date2.getTime();
        return date1InLongFormat-date2InLongFormat;
    }
}