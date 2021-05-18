package com.itvdn.homework.javastart.courseproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameNumber {

    public static void main(String[] args) {

        Map<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('A', 1);
        alphabet.put('B', 2);
        alphabet.put('C', 3);
        alphabet.put('D', 4);
        alphabet.put('E', 5);
        alphabet.put('F', 6);
        alphabet.put('G', 7);
        alphabet.put('H', 8);
        alphabet.put('I', 9);
        alphabet.put('J', 10);
        alphabet.put('K', 11);
        alphabet.put('L', 12);
        alphabet.put('M', 13);
        alphabet.put('N', 14);
        alphabet.put('O', 15);
        alphabet.put('P', 16);
        alphabet.put('Q', 17);
        alphabet.put('R', 18);
        alphabet.put('S', 19);
        alphabet.put('T', 20);
        alphabet.put('U', 21);
        alphabet.put('V', 22);
        alphabet.put('W', 23);
        alphabet.put('X', 24);
        alphabet.put('Y', 25);
        alphabet.put('Z', 26);

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя");

        String s = scanner.next();

        String s1 = s.toUpperCase();

        char[] chars = s1.toCharArray();
        int i = 0;
        for (char c: chars) {
            i += alphabet.get(c);
        }
        System.out.println(i);
        scanner.close();
    }
}

//        Задача 3
//        Создайте программу, которая выводит в консоль число имени, например,
//        на вход Roman = R(18) + О(15) + M(13) + A(1) + N(14) = 61 на выход 61.
