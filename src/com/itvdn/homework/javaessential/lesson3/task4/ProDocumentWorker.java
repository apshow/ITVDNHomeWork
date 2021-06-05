package com.itvdn.homework.javaessential.lesson3.task4;

public class ProDocumentWorker extends DocumentWorker{

    static int  secretKey = 111;

    public void editDocument(){
        System.out.println("Документ отредактирован");
    }
    public void saveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение " +
                "в остальных форматах доступно в версии Эксперт");
    }
}

