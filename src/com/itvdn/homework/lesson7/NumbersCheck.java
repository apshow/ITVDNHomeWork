package com.itvdn.homework.lesson7;

import java.util.Scanner;

public class NumbersCheck {

    static void isPositive(int x) {
        if (x > 0) {
            System.out.println("число " + x + " является положительным");
        } else if (x < 0){
            System.out.println("число " + x + " является отрицательным");
        } else {
            System.out.println("число " + x + " является нулем");
        }
    }

    static void isNumberPrime(int n) {
        if (n > 0 ){
            System.out.println("число " + n + " не является простым (является составным)");
        } else {
            boolean isComposite = false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                System.out.println("число " + n + " не является простым (является составным)");
            } else {
                System.out.println("число " + n + " является простым");
            }
        }
    }

    static void isDividedBy (int i){
        int [] arr = {2, 3, 5, 6, 9};
        for (int z: arr) {
            if (i % z == 0){
                System.out.println("число " + i + " делится на " + z + " без остатка");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число");

        int i = scanner.nextInt();
        isNumberPrime(i);
        isPositive(i);
        isDividedBy(i);

    }
}

//    Используя IntelliJ IDEA, создайте класс NumbersCheck.
//    Напишите метод, который будет определять:
//    1) является ли введенное число положительным или отрицательным.
//    2) Является ли оно простым (используйте технику перебора значений).
//        Простое число – это натуральное число, которое делится на 1 и само на себя.
//        Чтобы определить простое число или нет, следует найти все его целые делители.
//        Если делителей больше 2-х, значит оно не простое.
//
//    3) Делится ли на 2, 5, 3, 6, 9 без остатка.
