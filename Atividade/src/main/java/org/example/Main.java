package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    List<Pessoa> pessoas = new ArrayList<>();
    int quantidade = sc.nextInt();

    for(int i = 0 ; i<quantidade ; i++){
        System.out.print("Digite o seu nome: ");
        String nome = sc.next();
        Pessoa pessoa = new Pessoa(nome);
        pessoas.add(pessoa);
    }

        System.out.println("\nExibição: ");

    for(Pessoa pessoa : pessoas){
        System.out.println(pessoa);
    }

    sc.close();
    }
}


