package com.itvdn.homework.lesson9;

import java.util.Scanner;

public class CustomerArray {

    static void getArrayArbitraryNumbers(int n) {
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            sum += arr[i];
        }

        int maxArr = arr[0];
        int minArr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("наибольшее значение массива - " + maxArr);
        System.out.println("наменьшее значение массива - " + minArr);
        System.out.println("сумма всех элементов массива - " + sum);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива (положительное целое число)");
        int n = scanner.nextInt();
        getArrayArbitraryNumbers(n);

    }

}

//    Используя IntelliJ IDEA, создайте класс CustomerArray.
//        Требуется:
//        Создать массив размера N элементов, заполнить его произвольными целыми значениями
//        (размер массива задает пользователь).
//        Вывести на экран: наибольшее значение массива, наименьшее значение массива,
//        общую сумму всех элементов, среднее арифметическое всех элементов, вывести все нечетные значения.


