package com.itvdn.homework.javastart.lesson6;

public class Delivery {

    public static void main(String[] args) {
        int customer = 10;
        int numberOfRoutes = 1;
        int i = 1;

        do {
            numberOfRoutes *= i;
            i++;
        } while (i <= customer);

        System.out.println(numberOfRoutes);
    }
}

//        Задание 4
//        Имеется N клиентов, которым компания производитель должна доставить товар.
//        Сколько существует возможных маршрутов доставки товара, с учетом того, что товар будет
//        доставлять одна машина?
//        Используя IntelliJ IDEA, создайте класс Delivery.
//        Напишите программу, которая будет рассчитывать, и выводить на экран
//        количество возможных вариантов доставки товара. Для решения задачи, используйте факториал N!,
//        рассчитываемый с помощью цикла do-while.