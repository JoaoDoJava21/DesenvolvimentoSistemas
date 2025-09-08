package EnderecoGeral;

public class ClientePj extends Cliente {
    private String cnpj;

    public ClientePj(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("CNPJ: " + cnpj);
    }

    @Override
    public String toString() {
        return "ClientePj{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
