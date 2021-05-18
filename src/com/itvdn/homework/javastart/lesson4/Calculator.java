package com.itvdn.homework.javastart.lesson4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int operand1 = 22;
        int operand2 = 33;

        Scanner sc = new Scanner(System.in);
        System.out.println("введите знак арифметического действия: + - / * ");
        String arithmeticSine = sc.next();

        switch (arithmeticSine) {
            case "+": {
                System.out.println(operand1 + operand2);
                break;
            }
            case "-": {
                System.out.println(operand1 - operand2);
                break;
            }
            case "*": {
                System.out.println(operand1 * operand2);
                break;
            }
            case "/": {
                System.out.println(operand1 / operand2);
                break;
            }
            default: {
                System.out.println("неправильный ввод");
            }
        }

    }

}


//    Используя IntelliJ IDEA, создайте класс Calculator.
//        Напишите программу – консольный калькулятор.
//        Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения.
//        Предложите пользователю ввести знак арифметической операции.
//        Примите значение, введенное пользователем и поместите его в строковую переменную sign.
//        Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
//        Выведите на экран результат выполнения арифметической операции.
//        В случае использования операции деления, организуйте проверку попытки деления на ноль.
//        И если таковая имеется, то отмените выполнение арифметической операции и уведомите
//        об ошибке пользователя.