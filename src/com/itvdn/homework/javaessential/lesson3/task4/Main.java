package com.itvdn.homework.javaessential.lesson3.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DocumentWorker documentWorker;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите лицензионный ключ");
        int enter = scanner.nextInt();

        if (enter == ExpertDocumentWorker.secretKey){
            System.out.println("Версия Эксперт активирована");
            documentWorker = new ExpertDocumentWorker();

        } else if (enter == ProDocumentWorker.secretKey){
            System.out.println("Версия Про активирована");
            documentWorker = new ProDocumentWorker();
        } else {
            System.out.println("У Вас базовая версия");
            documentWorker = new DocumentWorker();
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();

    }
}
