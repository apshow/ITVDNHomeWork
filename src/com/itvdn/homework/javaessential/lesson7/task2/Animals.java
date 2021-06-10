package com.itvdn.homework.javaessential.lesson7.task2;

public enum Animals {
    TIGER(5), CAT(2), DOG(7), HORSE(12);

    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal {" +
                this.name() +
                ", age = " + age +
                '}';
    }
}

//        Задание 2
//        Создайте проект, используя IntelliJ IDEA.
//        Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен
//        принимать целочисленное значение (возраст животного), и содержать перегруженный метод toString(),
//        который должен возвращать название экземпляра и возраст животного.


