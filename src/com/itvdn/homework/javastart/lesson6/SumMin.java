package com.itvdn.homework.javastart.lesson6;

public class SumMin {

    public static void main(String[] args) {
        int a = 2;
        int b = 20;
        int sum = 0;
        StringBuffer odd = new StringBuffer();

        for (int i = (a + 1); i < b; i++) {
            sum += i;
        }
        System.out.println("сумма чисел между " + a + " и " + b + " равна: " + sum);

        for (int i = (a + 1); i < b; i++) {
            if ((i & 1) ==1) {
                odd.append(i).append(" ");
            }
        }
        System.out.println("все нечетные чисела между " + a + " и " + b + ": " + odd);
    }
}


//        Задание 2
//        Используя IntelliJ IDEA, создайте класс SumMin.
//        Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
//        Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.
//
