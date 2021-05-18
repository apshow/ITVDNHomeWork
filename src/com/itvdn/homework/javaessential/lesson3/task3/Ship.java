package com.itvdn.homework.javaessential.lesson3.task3;

public class Ship extends Vehicle {

    private int numberOfPassengers;
    private String homePort;

    public Ship(double latitude, double longitude, int price,
                int speed, int yearOfProduction,
                int numberOfPassengers, String homePort) {
        super(latitude, longitude, price, speed, yearOfProduction);
        this.numberOfPassengers = numberOfPassengers;
        this.homePort = homePort;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", homePort='" + homePort + '\'' +
                " latitude=" + getLatitude() +
                ", longitude=" + getLongitude() +
                ", price=" + getPrice() +
                ", speed=" + getSpeed() +
                ", yearOfProduction=" + getYearOfProduction() +
                '}';
    }
}
