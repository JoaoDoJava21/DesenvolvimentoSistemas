package org.example;

import java.util.Scanner;

public class ExibicaoPet {
    public static void main(String[] args) {
        Scanner mendigo = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = mendigo.next();

        System.out.println("Digite a sua idade: ");
        int idade = mendigo.nextInt();

        System.out.println("Digite o a sua raça: ");
        String raca = mendigo.next();

        System.out.println("Digite o seu porte: ");
        String porte = mendigo.nextLine();
        mendigo.nextLine();

        System.out.println("Digite a sua Alimentação :");
        String alimetacao = mendigo.nextLine();

        Pet pet = new Pet(nome,idade,raca,porte,alimetacao);

        System.out.println(pet.toString());


        mendigo.close();
    }
}
