package ClasseAnimais;

import java.util.Scanner;

public class MainAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exibindo dados com Scanner
        System.out.println("\nInformações do animal\n ");

        System.out.println("Informe o nome: ");
        String nome = sc.next();

        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();


        Animal animal = new Animal(nome,idade);

        animal.exibirInfo();
    }
}
