package com.itvdn.homework.javastart.lesson9;

import java.util.Arrays;

public class UserArray {

    static int[] getEnlargedArray(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = value;
        int j = 0;
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = array[j];
            j++;
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(getEnlargedArray(arr, 88)));
    }

}


//        Задание 4
//        Используя IntelliJ IDEA, создайте класс UserArray.
//        Требуется:
//        Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
//        на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
//        Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array,
//        второй аргумент – типа int value. В теле метода реализуйте возможность добавления
//        второго аргумента метода в массив по индексу 0, при этом длина нового массива, должна
//        увеличиться на 1 элемент, а элементы получаемого массива в качестве первого аргумента
//        должны скопироваться в новый массив начиная с индекса 1.
