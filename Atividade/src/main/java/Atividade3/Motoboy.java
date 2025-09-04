package Atividade3;

public class Motoboy extends Funcionario  {
    private String carteiraHabilitacao ;

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiraHabilitacao='" + carteiraHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo.getSexo() +
                ", setor=" + setor.getSetor() +
                ", SalarioBase=" + SalarioBase +
                '}';
    }

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }


    // Se tiver relação de herança colocar Super
    @Override
    public double getSalarioFinal() {
        return super.SalarioBase;
    }
}
