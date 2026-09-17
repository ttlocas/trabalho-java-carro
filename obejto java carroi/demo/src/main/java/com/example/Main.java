package com.example;

public class Main {

    public static void main(String[] args) {

        // Criar o carro
        Carro carro = new Carro(
                "BMW",
                "M3",
                "Preto",
                2024
        );

        // Mostrar informações iniciais
        System.out.println("===== CARRO CRIADO =====");
        carro.mostrarInformacoes();

        // Ligar o carro
        System.out.println();
        System.out.println("===== LIGAR CARRO =====");
        carro.ligar();

        // Acelerar
        System.out.println();
        System.out.println("===== ACELERAR =====");
        carro.acelerar(50);

        // Acelerar novamente
        System.out.println();
        System.out.println("===== ACELERAR NOVAMENTE =====");
        carro.acelerar(30);

        // Travar
        System.out.println();
        System.out.println("===== TRAVAR =====");
        carro.travar(20);

        // Acelerar novamente
        System.out.println();
        System.out.println("===== ACELERAR NOVAMENTE =====");
        carro.acelerar(40);

        // Mostrar informações
        System.out.println();
        System.out.println("===== INFORMAÇÕES ATUAIS =====");
        carro.mostrarInformacoes();

        // Desligar
        System.out.println();
        System.out.println("===== DESLIGAR CARRO =====");
        carro.desligar();

        // Mostrar informações finais
        System.out.println();
        System.out.println("===== INFORMAÇÕES FINAIS =====");
        carro.mostrarInformacoes();
    }
}