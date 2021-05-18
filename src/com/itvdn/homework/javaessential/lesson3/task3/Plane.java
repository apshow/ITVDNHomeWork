package com.itvdn.homework.javaessential.lesson3.task3;

public class Plane extends Vehicle {

    private int altitude;
    private int numberOfPassengers;

    public Plane(double latitude, double longitude, int price,
                 int speed, int yearOfProduction,
                 int altitude, int numberOfPassengers) {
        super(latitude, longitude, price, speed, yearOfProduction);
        this.altitude = altitude;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                " altitude=" + altitude +
                " latitude=" + getLatitude() +
                ", longitude=" + getLongitude() +
                ", price=" + getPrice() +
                ", speed=" + getSpeed() +
                ", yearOfProduction=" + getYearOfProduction() +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }

}
