package com.itvdn.homework.javaessential.lesson6.task2;

public class Vehicle {

    public void print(){
    }

    class Wheel{
        public void print(){
            System.out.println("Inner class Wheel");
        }
    }

    class Door{
        public void print(){
            System.out.println("Inner class Door");
        }
    }

    Wheel wheel = new Wheel();
    Door door = new Door();
}

//        Задание 2
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется:
//        Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
//        которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.



