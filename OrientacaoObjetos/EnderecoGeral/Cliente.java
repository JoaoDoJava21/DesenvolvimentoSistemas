package EnderecoGeral;

import java.util.ArrayList;

public class Clientes {
    private final ArrayList<Cliente> lista = new ArrayList<>();

    public void adicionar(Cliente cliente) {
        lista.add(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
            return;
        }
        System.out.println("\n--- LISTA DE CLIENTES ---");
        System.out.printf("%-5s %-20s %-25s %-15s%n", "Idx", "Nome", "Endereço", "CPF/CNPJ");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < lista.size(); i++) {
            Cliente c = lista.get(i);
            String documento = "";
            if (c instanceof ClientePf) {
                documento = ((ClientePf) c).getCpf();
            } else if (c instanceof ClientePj) {
                documento = ((ClientePj) c).getCnpj();
            }
            System.out.printf("%-5d %-20s %-25s %-15s%n", i, c.getNome(), c.getEndereco(), documento);
        }
    }

    public void alterar(int indice, Cliente novosDados) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, novosDados);
            System.out.println("Cliente alterado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public int tamanho() {
        return lista.size();
    }
}
