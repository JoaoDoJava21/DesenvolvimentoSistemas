package ClasseCarros;
public class Veiculo extends Carro{
    private String portas;

    public Veiculo(String marca, String modelo, int ano, String portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + portas);
    }
}
