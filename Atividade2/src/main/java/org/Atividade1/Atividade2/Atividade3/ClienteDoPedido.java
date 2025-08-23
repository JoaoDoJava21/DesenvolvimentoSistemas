package org.Atividade1.Atividade2.Atividade3;

public class ClienteDoPedido {
    private String nome;
    private Pedido pedido ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ClienteDoPedido(String nome, Pedido pedido) {
        this.nome = nome;
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "ClienteDoPedido{" +
                "nome='" + nome + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}
