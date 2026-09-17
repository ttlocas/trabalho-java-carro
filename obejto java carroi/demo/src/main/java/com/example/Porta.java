package com.example;

public class Porta {

    private boolean aberta;

    public Porta() {
        this.aberta = false;
    }

    public void abrir() {

        aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {

        aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public boolean isAberta() {

        return aberta;
    }
}