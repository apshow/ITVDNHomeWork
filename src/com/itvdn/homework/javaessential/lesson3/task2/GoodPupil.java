package com.itvdn.homework.javaessential.lesson3.task2;

public class GoodPupil extends Pupil{
    @Override
    void study() {
        System.out.println("Study good");
    }

    @Override
    void read() {
        System.out.println("Read good");
    }

    @Override
    void write() {
        System.out.println("Write good");
    }

    @Override
    void relax() {
        System.out.println("Relax good");
    }
}
