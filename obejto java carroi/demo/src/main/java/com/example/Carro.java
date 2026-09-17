package com.example;

public class Carro {

    // Atributos
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    // Estatísticas
    private int velocidade;
    private int estabilidade;

    // Estado
    private boolean ligado;

    // Componentes
    private Roda[] rodas;
    private Porta[] portas;
    private Janela[] janelas;
    private Capo capo;

    // GPS
    private Localizacao localizacao;

    // Construtor
    public Carro(String marca, String modelo, String cor, int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;

        this.velocidade = 0;
        this.estabilidade = 100;
        this.ligado = false;

        // 4 rodas
        this.rodas = new Roda[4];

        for (int i = 0; i < 4; i++) {
            rodas[i] = new Roda("Michelin", 17);
        }

        // 4 portas
        this.portas = new Porta[4];

        for (int i = 0; i < 4; i++) {
            portas[i] = new Porta();
        }

        // 4 janelas
        this.janelas = new Janela[4];

        for (int i = 0; i < 4; i++) {
            janelas[i] = new Janela();
        }

        // Capô
        this.capo = new Capo();

        // Localização GPS
        this.localizacao = new Localizacao(38.6600, -9.0720);
    }

    // Ligar o carro
    public void ligar() {

        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Desligar o carro
    public void desligar() {

        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Acelerar
    public void acelerar(int valor) {

        if (ligado) {

            if (valor > 0) {
                velocidade += valor;

                // Velocidade máxima de 200 km/h
                if (velocidade > 200) {
                    velocidade = 200;
                }

                System.out.println(
                        "O carro está a " + velocidade + " km/h."
                );

            } else {
                System.out.println("O valor da aceleração deve ser positivo.");
            }

        } else {
            System.out.println(
                    "Não podes acelerar. O carro está desligado."
            );
        }
    }

    // Travar
    public void travar(int valor) {

        if (valor > 0) {

            velocidade -= valor;

            if (velocidade < 0) {
                velocidade = 0;
            }

            System.out.println(
                    "O carro está a " + velocidade + " km/h."
            );

        } else {
            System.out.println("O valor da travagem deve ser positivo.");
        }
    }

    // Mostrar informações
    public void mostrarInformacoes() {

        System.out.println();
        System.out.println("=================================");
        System.out.println("       INFORMAÇÕES DO CARRO");
        System.out.println("=================================");

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);

        System.out.println();
        System.out.println("----- ESTATÍSTICAS -----");
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Estabilidade: " + estabilidade + "%");

        System.out.println();
        System.out.println("----- COMPONENTES -----");
        System.out.println("Rodas: " + rodas.length);
        System.out.println("Portas: " + portas.length);
        System.out.println("Janelas: " + janelas.length);
        System.out.println("Capô: 1");

        System.out.println();
        System.out.println("----- GPS -----");
        localizacao.mostrarLocalizacao();

        System.out.println();
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));

        System.out.println("=================================");
    }
}