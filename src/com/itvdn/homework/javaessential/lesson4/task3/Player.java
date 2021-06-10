package com.itvdn.homework.javaessential.lesson4.task3;

public class Player implements Playable, Recordable{

    @Override
    public void play() {

    }

    @Override
    public void record() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.stop();
        player.pause();
        player.record();
    }
}

//        Задание 3
//        Используя IntelliJ IDEA, создайте проект.Требуется:
//        Создайте 2 интерфейса Playable и Recordable. В каждом из интерфейсов создайте
//        по 3 метода
//        void play() / void pause() / void stop() и
//        void record() / void pause() / void stop() соответственно.
//        Создайте производный класс Player от базовых интерфейсов Playable и Recordable.
//        Написать программу, которая выполняет проигрывание и запись.

//        Задание 4
//        Зайдите на сайт Oracle.
//        Используя поисковые механизмы Oracle, найдите самостоятельно описание темы по каждому примеру,
//        который был рассмотрен на уроке, так, как это представлено ниже, в разделе «Рекомендуемые ресурсы»,
//        описания данного урока. Сохраните ссылки и дайте им короткое описание.

