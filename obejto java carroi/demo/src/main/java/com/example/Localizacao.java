package com.example;

public class Localizacao {

    private double latitude;
    private double longitude;

    public Localizacao(double latitude, double longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void mostrarLocalizacao() {

        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
}