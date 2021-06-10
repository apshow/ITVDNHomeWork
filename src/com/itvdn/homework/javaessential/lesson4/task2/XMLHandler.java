package com.itvdn.homework.javaessential.lesson4.task2;

public class XMLHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("HML document open");
    }

    @Override
    void create() {
        System.out.println("HML document create");
    }

    @Override
    void change() {
        System.out.println("HML document change");
    }

    @Override
    void save() {
        System.out.println("HML document save");
    }
}
