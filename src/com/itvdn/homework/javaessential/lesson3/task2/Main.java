package com.itvdn.homework.javaessential.lesson3.task2;

public class Main {

    public static void main(String[] args) {

        ClassRoom [] classRooms = new ClassRoom[4];

        classRooms[0] = new ClassRoom(new BadPupil());
        classRooms[1] = new ClassRoom(new GoodPupil());
        classRooms[2] = new ClassRoom(new ExcellentPupil());
        classRooms[3] = new ClassRoom(new ExcellentPupil());
    }
}
