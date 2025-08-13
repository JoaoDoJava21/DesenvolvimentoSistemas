package ArrayLs;

import java.util.Scanner;

public class ClasseDentro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite sua idade: ");
        Double alt = sc.nextDouble();

        ClasseFora classeFora = new ClasseFora(nome , idade , alt);

        classeFora.toString();

        sc.close();

    }
}
