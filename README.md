# 🚗 Java Car Project

Projeto desenvolvido em **Java** com o objetivo de aplicar conceitos de **Programação Orientada a Objetos (POO)** através da criação e gestão de um carro.

## 📌 Funcionalidades

O projeto representa um carro com diferentes componentes e características.

### 🚘 Carro

* Marca
* Modelo
* Cor
* Ano
* Estado (ligado/desligado)
* Velocidade
* Estabilidade
* Localização GPS

### 🔧 Componentes

* 🛞 4 Rodas
* 🚪 4 Portas
* 🪟 4 Janelas
* 🔧 1 Capô

### 🎮 Ações

O carro permite:

* Ligar
* Desligar
* Acelerar
* Travar
* Consultar informações do carro

As ações do carro são controladas através da classe `Main`.

## 📂 Estrutura do Projeto

```text
src/
└── main/
    └── java/
        └── com/
            └── example/
                ├── Main.java
                ├── Carro.java
                ├── Roda.java
                ├── Porta.java
                ├── Janela.java
                ├── Capo.java
                └── Localizacao.java
```

## 🧱 Classes

| Classe        | Descrição                                    |
| ------------- | -------------------------------------------- |
| `Carro`       | Representa o carro e as suas funcionalidades |
| `Roda`        | Representa uma roda                          |
| `Porta`       | Representa uma porta                         |
| `Janela`      | Representa uma janela                        |
| `Capo`        | Representa o capô                            |
| `Localizacao` | Representa a localização GPS                 |
| `Main`        | Executa e controla o carro                   |

## 💻 Exemplo

O carro é criado e controlado através da classe `Main`:

```java
Carro carro = new Carro(
        "BMW",
        "M3",
        "Preto",
        2024
);

carro.ligar();

carro.acelerar(50);

carro.acelerar(30);

carro.travar(20);

carro.desligar();
```

## 📊 Exemplo de informações

```text
=================================
       INFORMAÇÕES DO CARRO
=================================
Marca: BMW
Modelo: M3
Cor: Preto
Ano: 2024

----- ESTATÍSTICAS -----
Velocidade: 60 km/h
Estabilidade: 100%

----- COMPONENTES -----
Rodas: 4
Portas: 4
Janelas: 4
Capô: 1

----- GPS -----
Latitude: 38.66
Longitude: -9.072

Estado: Desligado
=================================
```

## 🛠️ Tecnologias

* ☕ Java
* 📦 Maven
* 🧱 Programação Orientada a Objetos

## 🎯 Objetivo

O objetivo deste projeto é praticar conceitos fundamentais de **Java e Programação Orientada a Objetos**, incluindo:

* Classes e objetos
* Atributos
* Métodos
* Construtores
* Encapsulamento
* Arrays de objetos
* Relação entre classes

## 👨‍💻 Autor

**Tomás Marques**

---

⭐ Projeto desenvolvido para fins académicos.
