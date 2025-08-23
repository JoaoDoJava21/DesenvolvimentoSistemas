package org.Atividade1.Atividade2.Atividade3;

public class ExibicaoPedido {
    public static void main(String[] args) {
        ClienteDoPedido cliente = new ClienteDoPedido("Marta" , Pedido.ABERTO );

        System.out.println(cliente.toString());
    }
}
