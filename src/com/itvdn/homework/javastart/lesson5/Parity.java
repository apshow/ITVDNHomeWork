package com.itvdn.homework.javastart.lesson5;

import java.util.Scanner;

public class Parity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое число");
        int num = sc.nextInt();
        if ((num & 1) != 1){
            System.out.println("число четное");
        } else {
            System.out.println("число нечетное");
        }

        // второй вариант
//        if ((num % 2) == 0){
//            System.out.println("число четное");
//        } else {
//            System.out.println("число нечетное");
//        }
    }
}
