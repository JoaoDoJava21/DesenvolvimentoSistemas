package org.example;

public class Pet {
    private String nome ;
    private int idade;
    private String raca ;
    private String porte ;
    private String alimentacao ;

    public Pet(String nome){
        this.nome = nome;
    }
    public Pet(String nome , int idade ,String raca, String porte, String alimentacao   ) {
        this.alimentacao = alimentacao;
        this.porte = porte;
        this.raca = raca;
        this.idade = idade;
        this.nome = nome;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nDados: " +
                " \nNome: " + nome +
                " \nIdade: " + idade +
                " \nRaça: " + raca +
                " \nPorte: " + porte +
                " \nAlimentação: " + alimentacao
                ;
    }
}
