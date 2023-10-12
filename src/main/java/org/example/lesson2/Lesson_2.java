package org.example.lesson2;

import java.util.Arrays;

public class Lesson_2 {
    //    Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
//    Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
//    Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    public int numberOfEvenElementsInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) count++;
        }
        return count;
    }

    public long differenceBetweenMaxAndMin(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return (long) array[array.length - 1] - (long) array[0];
    }

    /**
     * This method find element which neighbours are "neighbours" and return true if element exist.
     *
     * @param array      int array
     * @param neighbours this is neighbours
     * @return true or false
     */

    public boolean isExistElementInArrayWithNeighbours(int[] array, int neighbours) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] == neighbours && array[i + 1] == neighbours)
                return true;
        }
        return false;

    }
}
