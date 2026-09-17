package com.example;

public class Roda {

    private String marca;
    private int tamanho;

    public Roda(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void mostrarInformacoes() {

        System.out.println("Marca da roda: " + marca);
        System.out.println("Tamanho da roda: " + tamanho + " polegadas");
    }
}