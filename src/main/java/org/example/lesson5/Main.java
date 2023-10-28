package org.example.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Егоров", Arrays.asList(4.0, 4.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Информатика");
        Student student2 = new Student("Седов", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Алгебра");
        Student student3 = new Student("Рыжов", Arrays.asList(4.0, 3.0, 5.0, 5.0, 3.0, 5.0, 4.0, 4.0), "Физика");
        Student student4 = new Student("Филипов", Arrays.asList(5.0, 5.0, 5.0, 5.0, 4.0, 5.0, 5.0, 5.0), "Информатика");
        Student student5 = new Student("Попов", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Информатика");
        Student student6 = new Student("Рачков", Arrays.asList(4.0, 4.0, 5.0, 5.0, 4.0, 5.0, 3.0, 5.0), "Информатика");
        Student student7 = new Student("Лужков", Arrays.asList(5.0, 5.0, 5.0, 5.0, 4.0, 3.0, 5.0, 3.0), "Информатика");
        Student student8 = new Student("Разнов", Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0, 5.0, 5.0, 4.0), "Информатика");
        Student student9 = new Student("Чуров", Arrays.asList(4.0, 4.0, 4.0, 5.0, 4.0, 4.0, 5.0, 5.0), "Информатика");
        Student student10 = new Student("Нагоров", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0), "Информатика");
        Student student11 = new Student("Алиев", Arrays.asList(4.0, 4.0, 5.0, 5.0, 4.0, 5.0, 4.0, 3.0), "Алгебра");
        Student student12 = new Student("Довгань", Arrays.asList(4.0, 4.0, 5.0, 5.0, 4.0, 5.0, 5.0, 5.0), "Теория вероятностей");
        Student student13 = new Student("Зорин", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 3.0, 5.0), "Информатика");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);

        List<Student> studentsOfInformatics = students.stream().
                filter(a -> a.getSpecialty().equals("Информатика")).
                filter(a -> a.getAverageGrade() > 4.5).
                sorted(Comparator.comparing(Student::getAverageGrade).reversed()).
                limit(5).

                collect(Collectors.toList());
        for (Student student : studentsOfInformatics) {
            System.out.println(student);
        }
    }
}
