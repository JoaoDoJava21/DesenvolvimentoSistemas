package org.Atividade1.Atividade2;

public class Pet {
    private String nomeAnimal;
    private int idadeAnimal ;
    private String raca ;



    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Pet(String nomeAnimal, int idadeAnimal, String raca) {
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.raca = raca;
    }
    @Override
    public String toString() {
        return "Pet{" +
                "nomeAnimal='" + nomeAnimal + '\'' +
                ", idadeAnimal=" + idadeAnimal +
                ", raca='" + raca + '\'' +
                '}';
    }
}
