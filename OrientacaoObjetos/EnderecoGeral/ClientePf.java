package EnderecoGeral;

public class ClientePf extends Cliente {
    private String cpf;

    public ClientePf(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("CPF: " + cpf);
    }

    @Override
    public String toString() {
        return "ClientePf{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
