package com.itvdn.homework.javaessential.lesson3.task3;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car(11.3, 12.9, 13600, 180, 2015);
        Vehicle plane = new Plane(11.3, 12.9, 11600000, 850,
                2015, 11000, 56);
        Vehicle ship = new Ship(11.3, 12.9, 2500000,
                850, 2015, 11000, "Marsel");


        System.out.println(car);
        System.out.println(plane);
        System.out.println(ship);
    }
}
