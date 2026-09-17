package com.example;

public class Janela {

    private boolean aberta;

    public Janela() {
        this.aberta = false;
    }

    public void abrir() {

        aberta = true;
        System.out.println("A janela foi aberta.");
    }

    public void fechar() {

        aberta = false;
        System.out.println("A janela foi fechada.");
    }

    public boolean isAberta() {

        return aberta;
    }
}