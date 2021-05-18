package com.itvdn.homework.lesson7;

import java.util.Scanner;

public class Arithmetics {

    static void add (int x , int y){
        System.out.println(x + y);
    }

    static void sub (int x , int y){
        System.out.println(x - y);
    }

    static void mul (int x , int y){
        System.out.println(x * y);
    }

    static void div (int x , int y){
        if (y == 0){
            System.out.println("на ноль делить нельзя");
        } else {
            System.out.println(x / y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите первое целое число");
        String strX = sc.next();
        int x = Integer.parseInt(strX);
        System.out.println("введите второе целое число");
        String strY = sc.next();
        int y = Integer.parseInt(strY);

        System.out.println("введите знак арифметического действия +, -, *, /");
        String strArSine = sc.next();
        if (strArSine.equals("+")){
            add(x, y);
        } else if (strArSine.equals("-")){
            sub(x, y);
        }else if (strArSine.equals("*")){
            mul(x, y);
        }else if (strArSine.equals("/")){
            div(x, y);
        } else {
            System.out.println("вы ввели некорректный знак арифметического действия");
        }
    }
}

//    Используя IntelliJ IDEA, создайте класс Arithmetics.
//        Создайте четыре метода для выполнения арифметических операций, с именами: add – сложение,
//        sub – вычитание, mul – умножение, div – деление.
//        Каждый метод должен принимать два целочисленных аргумента и выводить на экран результат
//        выполнения арифметической операции соответствующей имени метода.
//        Метод деления div, должен выполнять проверку попытки деления на ноль.
//        Требуется предоставить пользователю возможность вводить с клавиатуры
//        значения операндов и знак арифметической операции, для выполнения вычислений.
