package com.itvdn.homework.javaessential.lesson3.task2;

public class BadPupil extends Pupil{
    @Override
    void study() {
        System.out.println("Study bad");
    }

    @Override
    void read() {
        System.out.println("Read bad");
    }

    @Override
    void write() {
        System.out.println("Write bad");
    }

    @Override
    void relax() {
        System.out.println("Relax too much");
    }
}
