package org.Atividade1.Atividade2;

public class Exibicao {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João" , 15 , new Pet("Bob" , 1 , "Bulldog"));

        System.out.println(cliente);
    }
}
