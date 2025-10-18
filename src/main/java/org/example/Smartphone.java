package org.example;

import java.util.Arrays;

public class Smartphone implements GPS, Cellular {
    private String model;
    private double latitude;
    private double longitude;

    public Smartphone(String model, double latitude, double longitude) {
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Реалізація методу з інтерфейсу GPS
    @Override
    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    // Реалізація методів з інтерфейсу Cellular
    @Override
    public void makeCall() {
        System.out.println(model + " виконує дзвінок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + " приймає дзвінок...");
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", coordinates=" + Arrays.toString(getCoordinates()) +
                '}';
    }
}
