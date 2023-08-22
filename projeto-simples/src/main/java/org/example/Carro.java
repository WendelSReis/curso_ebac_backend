package org.example;
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean ligado;

    // Construtor da classe
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.ligado = false; // O carro começa desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Carro usando o construtor
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 150000.0);

        // Ligando e exibindo informações do carro
        meuCarro.ligar();
        meuCarro.exibirInformacoes();

        // Desligando e exibindo informações do carro novamente
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}

