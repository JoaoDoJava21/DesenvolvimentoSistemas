package EnderecoGeral;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clientes clientes = new Clientes(); // Criar apenas UMA vez
        int opcao;

        do {
            System.out.println("\n===== MENU CLIENTES =====");
            System.out.println("1 - Adicionar Cliente PF");
            System.out.println("2 - Adicionar Cliente PJ");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - Alterar cliente");
            System.out.println("5 - Remover cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa buffer

            switch (opcao) {
                case 1: {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    clientes.adicionar(new ClientePf(nome, endereco, cpf));
                    break;
                }
                case 2: {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = sc.nextLine();
                    clientes.adicionar(new ClientePj(nome, endereco, cnpj));
                    break;
                }
                case 3: {
                    clientes.listar();
                    break;
                }
                case 4: {
                    clientes.listar();
                    System.out.print("Índice para alterar: ");
                    int idx = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tipo (1-PF, 2-PJ): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("CPF: ");
                        String cpf = sc.nextLine();
                        clientes.alterar(idx, new ClientePf(nome, endereco, cpf));
                    } else if (tipo == 2) {
                        System.out.print("CNPJ: ");
                        String cnpj = sc.nextLine();
                        clientes.alterar(idx, new ClientePj(nome, endereco, cnpj));
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;
                }
                case 5: {
                    clientes.listar();
                    System.out.print("Índice para remover: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    clientes.remover(idx);
                    break;
                }
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
