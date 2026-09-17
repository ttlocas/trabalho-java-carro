package com.example;

public class Capo {

    private boolean aberto;

    public Capo() {
        this.aberto = false;
    }

    public void abrir() {

        aberto = true;
        System.out.println("O capô foi aberto.");
    }

    public void fechar() {

        aberto = false;
        System.out.println("O capô foi fechado.");
    }

    public boolean isAberto() {

        return aberto;
    }
}