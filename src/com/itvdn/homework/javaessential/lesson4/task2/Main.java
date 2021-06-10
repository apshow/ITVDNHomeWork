package com.itvdn.homework.javaessential.lesson4.task2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractHandler handler = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите расширение файла (DOC, TXT или XML)");

        String input = scanner.next().toUpperCase();

        if (input.equals("DOC")){
            handler = new DOCHandler();
        } else if(input.equals("TXT")){
            handler = new TXTHandler();
        } else if (input.equals("XML")){
            handler = new XMLHandler();
        }

        try {
            handler.open();
            handler.create();
            handler.change();
            handler.save();
        } catch (NullPointerException e){
            System.out.println("неправильное расширение");
        }

    }
}
