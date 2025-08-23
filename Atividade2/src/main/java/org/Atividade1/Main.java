package org.Atividade1;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Produtos> lista = new ArrayList<>();
        int quantidade = 2 ;

        for(int i = 0 ; i<quantidade ; i++ ){
            System.out.print("Digite o seu nome " + (i+1) + " :");
            String nome = sc.nextLine();

            System.out.print("Digite a sua idade" + (i+1) + " :");
            int idade = sc.nextInt();
            sc.nextLine();

            Produtos produtos = new Produtos(nome , idade);
            lista.add(produtos);
        }

        System.out.println("\nResultado: ");

        for(Produtos produtos : lista){
            System.out.println(produtos.getNome() + " " + produtos.getIdade());
        }

        sc.close();
    }
}