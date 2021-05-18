package com.itvdn.homework.lesson5;

public class Premium {

    public static void main(String[] args) {
        int workExperience = 11;
        int wage = 1000;
        double bonus;

        if (workExperience >= 0 && workExperience < 5) {
            System.out.println(bonus = wage * 0.1);
        } else if (workExperience >= 5 && workExperience < 10) {
            System.out.println(bonus = wage * 0.15);
        } else if (workExperience >= 10 && workExperience < 15) {
            System.out.println(bonus = wage * 0.25);
        } else if (workExperience >= 15 && workExperience < 20) {
            System.out.println(bonus = wage * 0.35);
        } else if (workExperience >= 20 && workExperience < 25) {
            System.out.println(bonus = wage * 0.45);
        } else if (workExperience > 25) {
            System.out.println(bonus = wage * 0.50);
        }

    }
}

//    Используя IntelliJ IDEA, создайте класс Premium.
//        Напишите программу расчета начисления премий сотрудникам.
//        Премии рассчитываются согласно выслуге лет.
//        Если выслуга до 5 лет, премия составляет 10% от заработной платы.
//        Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
//        Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
//        Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
//        Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
//        Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
//        Результаты расчета, выведите на экран.