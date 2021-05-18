package com.itvdn.homework.lesson5;

public class Premium {

    public static void main(String[] args) {
        int workExperience = 22;
        int wage = 1000;
        double bonusСoefficient = 0;

        if (workExperience >= 0 && workExperience < 5) {
            bonusСoefficient =  0.1;
        } else if (workExperience >= 5 && workExperience < 10) {
            bonusСoefficient = 0.15;
        } else if (workExperience >= 10 && workExperience < 15) {
            bonusСoefficient = 0.25;
        } else if (workExperience >= 15 && workExperience < 20) {
            bonusСoefficient = 0.35;
        } else if (workExperience >= 20 && workExperience < 25) {
            bonusСoefficient = 0.45;
        } else if (workExperience > 25) {
            bonusСoefficient = 0.50;
        }
        System.out.println(wage * bonusСoefficient);

    }
}
