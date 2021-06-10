package com.itvdn.homework.javaessential.lesson6.task3;

public class Distance {
    private double distance;

    public void print() {

    }

    static class Converter {

        public double convertMetersToMiles(int meters) {
            return meters / 1609;
        }

        public double convertMetersToInch(double meters) {
            return meters * 39.370;
        }

        public double convertMetersToFoot(double meters) {
            return meters * 3.281;
        }
    }

    public static void main(String[] args) {
        Distance.Converter converter = new Converter();
        System.out.println(converter.convertMetersToMiles(11000));
        System.out.println(converter.convertMetersToInch(0.55));
        System.out.println(converter.convertMetersToFoot(1.55));
    }

}

//        Задание 3
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется:
//        Создать класс Distance с полем distance типа double и методом print.
//        В классе Distance, создайте статический класс Converter с методами, которые будут
//        конвертировать расстояние в разные единицы измерения (к примеру, из метров в километры,
//        из километров в мили, и так далее).
