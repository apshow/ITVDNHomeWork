package com.itvdn.homework.javaessential.lesson4.task2;

public class TXTHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("TXT document open");
    }

    @Override
    void create() {
        System.out.println("TXT document create");
    }

    @Override
    void change() {
        System.out.println("TXT document change");
    }

    @Override
    void save() {
        System.out.println("TXT document save");
    }
}
