package com.itvdn.homework.javaessential.lesson4.task2;

public class DOCHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Doc document open");
    }

    @Override
    void create() {
        System.out.println("Doc document create");
    }

    @Override
    void change() {
        System.out.println("Doc document change");
    }

    @Override
    void save() {
        System.out.println("Doc document save");
    }
}
