package com.itvdn.homework.lesson5;

public class LogicOperations {

    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        System.out.println(x += y >> x++ * z);
        System.out.println(z = ++x & y * 5);
        System.out.println(y /= x + 5 | z);
        System.out.println(x = y << x++ ^ z);

    }

}

//    Используя IntelliJ IDEA, создайте класс LogicOperations.
//        Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
//        Выполните и рассчитайте результат следующих операций для этих переменных:
//         x+=y>>x++*z;  z=++x&y*5;
//         y/=x+5|z;
//         z=x++&y*5;
//         x=y<<x++^z;