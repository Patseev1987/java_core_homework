package org.example.lesson5;

import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        if (grades == null || grades.isEmpty())
            return -1;
        double result = 0;
        for (int i = 0; i < grades.size(); i++) {
            result += grades.get(i);
        }
        result = result / grades.size();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Студент: " + name +
                "\nСпециальность: " + specialty +
                "\nСредняя балл: " + getAverageGrade()+"\n";
    }
}
