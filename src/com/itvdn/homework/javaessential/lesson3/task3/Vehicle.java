package com.itvdn.homework.javaessential.lesson3.task3;

public class Vehicle {

    private double latitude;
    private double longitude;

    private int price;
    private int speed;
    private int yearOfProduction;

    public Vehicle(double latitude, double longitude, int price, int speed, int yearOfProduction) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        this.speed = speed;
        this.yearOfProduction = yearOfProduction;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", price=" + price +
                ", speed=" + speed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

//        Задание 3
//        Используя IntelliJ IDEA, создайте проект.
//        Требуется:
//        Создать класс Vehicle.
//        В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
//        Создайте 3 производных класса Plane, Саг и Ship.
//        Для класса Plane должна быть определена высота и количество пассажиров.
//        Для класса Ship – количество пассажиров и порт приписки.
//        Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
