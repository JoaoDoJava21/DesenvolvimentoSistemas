package ArrayLs;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAtt2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Double>notas = new ArrayList<>();
        String resposta;
        do {
            System.out.println("Digite uma nota: ");
            notas.add(sc.nextDouble());

            System.out.println("Deseja inserir mais uma nota? ");
            System.out.println("\nPressione a tecla N para sair.");
            resposta = sc.next();
        } while (!resposta.equalsIgnoreCase("n"));
        System.out.println("\nExibindo notas: ");
        for(double nota: notas){
            System.out.println("Nota: " + nota);
        }

        sc.close();
    }
}
