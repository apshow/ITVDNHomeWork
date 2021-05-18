package com.itvdn.homework.javastart.lesson4;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число в диапазоне от 0 до 100");
        int input = sc.nextInt();

        if (input >= 0 && input <= 14){
            System.out.println("число в интервале [0 - 14]");
        } else if (input >= 15 && input <= 35){
            System.out.println("число в интервале [15 - 35]");
        }else if (input >= 36 && input <= 50){
            System.out.println("число в интервале [36 - 50]");
        }else if (input >= 51 && input <= 100){
            System.out.println("число в интервале [51 - 100]");
        } else {
            System.out.println("неверный ввод");
        }

    }
}

//    Используя IntelliJ IDEA, создайте класс Interval.
//        Напишите программу определения, попадает ли указанное пользователем число от 0 до 100
//        в числовой промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100]. Если да, то укажите,
//        в какой именно промежуток. Если пользователь указывает число, не входящее ни в один
//        из имеющихся числовых промежутков, то выводится соответствующее сообщение.