package com.itvdn.homework.javaessential.lesson1.task4;

import java.util.Arrays;

public class Computer {

    String someString;

    public static void main(String[] args) {
        Computer[] computer = new Computer[5];
        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();


        for (int i = 0; i < computer.length; i++) {
            computer[i].someString = "someString " + i;
        }
        for (Computer c: computer) {
            System.out.println(c.someString);
        }

    }
}


//        Задание 4
//        Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
//        Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop)

