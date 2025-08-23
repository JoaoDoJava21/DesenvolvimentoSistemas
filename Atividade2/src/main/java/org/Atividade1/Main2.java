package org.Atividade1;

public class Main2 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João" ,15 , new Endereco("Rua A" , 15));
        System.out.println(cliente.toString());

    }
}
