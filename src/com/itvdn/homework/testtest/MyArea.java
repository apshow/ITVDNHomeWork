package com.itvdn.homework.testtest;

public class MyArea {

    public static final double PI = 3.14;

    static double areaOfCircle(double radius) {
    return radius * radius * PI;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(MyArea.areaOfCircle(3.3));
    }
}
