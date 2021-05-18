package com.itvdn.homework.lesson9;

import java.util.Arrays;

public class ReversedArray {

    static int[] myReverse(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(myReverse(arr)));
    }

}

//        Задание 3
//        Используя IntelliJ IDEA, создайте класс ReversedArray.
//        Требуется:
//        1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
//        целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном порядке).
//
//        2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает часть
//        полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index, размерностью, которая соответствует значению аргумента count.
//        Если аргумент count содержит значение больше чем количество элементов, которые входят в
//        выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
//        то при формировании нового массива размерностью в count, заполните единицами те элементы,
//        которые не были скопированы из исходного массива.