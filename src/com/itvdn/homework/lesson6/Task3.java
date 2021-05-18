package com.itvdn.homework.lesson6;

public class Task3 {

    public static void main(String[] args) {
        int heightRectangle = 5;
        int widthRectangle = 10;

        for (int i = 0; i < heightRectangle; i++) {
            for (int j = 0; j < widthRectangle; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();

        int heightTriangle = 5;
        int widthTriangle = heightTriangle;

        for (int i = 0; i < heightTriangle; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();

        int heightEquilateralTriangle = 5;
        int widthEquilateralTriangle = (heightEquilateralTriangle * 2) - 1;

        for (int i = 0; i < heightEquilateralTriangle; i++) {
            for (int j = 0; j < widthEquilateralTriangle; j++) {
                if (j <= (heightEquilateralTriangle + i - 1) && j >= (heightEquilateralTriangle - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();

        int heightRhombus = 9; //  должно быть четным числом, иначе нарушается симметрия
        int widthRhombus = heightRhombus;

        int widthRhombusHalf = widthRhombus / 2;

        for (int i = 0; i < heightRhombus; i++) {
            for (int j = 0; j < widthRhombus; j++) {
                if ((i <= widthRhombusHalf) && (j <= (widthRhombusHalf + i)) && j >= (widthRhombusHalf - i)) {
                    System.out.print("*");
                    System.out.print(" ");
                } else if ((i > widthRhombusHalf) && ((j >= i - widthRhombusHalf) && j <=  widthRhombusHalf - i
                        + widthRhombus -1)) {
                    System.out.print("*");
                    System.out.print(" ");

                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}


//        Задание 3
//        Используя IntelliJ IDEA, создайте класс.
//        Используя циклы и метод:
//        System.out.print("*"), System.out.print(" "), System.out.print("\n") (для перехода на новую строку).
//        Выведите на экран:
//        - прямоугольник
//        - прямоугольный треугольник
//        - равносторонний треугольник
//        - ромб
//
//    rectangle
//            triangle
//    EquilateralTriangle
//   Rhombus


