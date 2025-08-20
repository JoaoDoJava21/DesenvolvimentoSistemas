package org.example;

public class Veiculo {
    private String placa ;
    private String cor ;
    private int numeroPassageiros;
    private int capacidadeTanque;
    private Object velocidadeMaxima;
    private double consumoMedio;


    public Veiculo(String placa, String cor, int numeroPassageiros,int capacidadeTanque, double velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;

    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Object getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Object velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numeroPassageiros=" + numeroPassageiros +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", consumoMedio=" + consumoMedio +
                '}';
    }
}
