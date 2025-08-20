package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExibicaoPet2 {
    public static void main(String[] args) {
        Scanner bolsonaro = new Scanner(System.in);

        List<Pet> pets = new ArrayList<>();
        int quantidade = bolsonaro.nextInt();

        for (int i=0;i<quantidade;i++){
            System.out.print("Digite o nome do seu Pet "+ (i+1) + " : ");
            String nome = bolsonaro.next();

            System.out.print("Digite a idade do seu Pet "+ (i+1) + " : ");
            int idade = bolsonaro.nextInt();
            bolsonaro.nextLine();

            System.out.print("Digite Raça do seu Pet "+ (i+1) + " : ");
            String raca = bolsonaro.nextLine();

            System.out.print("Digite o porte do Pet "+ (i+1) + " : ");
            String porte = bolsonaro.nextLine();


            System.out.print("Digite a alimentação do seu Pet "+ (i+1) + " : ");
            String alimetacao = bolsonaro.nextLine();

            Pet mizera = new Pet(nome,idade,raca,porte,alimetacao);
            pets.add(mizera);
        }

        System.out.println("\nExibição de dados: ");
        for(Pet mizera : pets){
            System.out.println(mizera.toString());
        }
        bolsonaro.close();
    }
}
