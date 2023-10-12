package org.example;

import org.example.lesson2.Lesson_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Lesson_2 lesson2 = new Lesson_2();
        int[] array = {1, 1, 3, 1};
        System.out.println(lesson2.numberOfEvenElementsInArray(array));
        //  int[] array2 = {Integer.MAX_VALUE,Integer.MIN_VALUE};
        int[] array2 = {-10, -5};
        int[] array3 = {0, 2, 0, 2, 3, 4, 5, 6};
        System.out.println(lesson2.differenceBetweenMaxAndMin(array2));


        System.out.println(lesson2.isExistElementInArrayWithNeighbours(array3, 0));


    }
}