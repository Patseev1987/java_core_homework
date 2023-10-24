package org.example.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee andrey = new Employee("Andrey","Serov",
                "Igorevich","Electric","8-985-664-52-63",
                50000,46);
        Employee oleg = new Employee("Oleg","Ivanov",
                "Sergeevich","Teacher","8-985-664-85-63",
                70000,40);
        Employee irina = new Employee("Irina","Tarelkina",
                "Sergeevna","Cleaner","8-985-664-52-79",
                40000,50);
        Director alesha = new Director("Alesha","Gromov",
                "Alekseevich","Director","8-985-777-77-77",
                500000,25);
        Employee grisha = new Employee("Grisha","Ershov",
                "Nikolaevich","Manager","8-985-664-52-63",
                150000,43);

        Employee[] hornsAndHooves = new Employee[5];
        hornsAndHooves[0] = andrey;
        hornsAndHooves[1] = oleg;
        hornsAndHooves[2] = irina;
        hornsAndHooves[3] = alesha;
        hornsAndHooves[4] = grisha;

        for (Employee emp:hornsAndHooves) {
            System.out.println(emp);
        }
        Director.increaseSalary(hornsAndHooves,100000,20);
        System.out.println("+++++++++++++++++=");
        for (Employee emp:hornsAndHooves) {
            System.out.println(emp);
        }


        Employee.averageAge(hornsAndHooves);
        Employee.averageSalary(hornsAndHooves);
        System.out.println( Employee.compareTwoDate(2009,12
                ,12,2008,12,12));
    }

}
