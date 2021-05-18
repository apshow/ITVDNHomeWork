package com.itvdn.homework.javastart.lesson3;

public class Volume {

    public static void main(String[] args) {
        final double PI = Math.PI;
        double r = 10;
        double h = 10;

        double cylinderSurfaceArea = 2 * PI * r * (r + h);
        double cylinderVolume = PI * r * r * h;

        System.out.println(cylinderSurfaceArea);
        System.out.println(cylinderVolume);
    }
}
