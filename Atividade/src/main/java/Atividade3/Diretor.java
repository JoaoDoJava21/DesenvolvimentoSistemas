package Atividade3;

public class Diretor extends Funcionario implements Contratacao{

    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo.getSexo() +
                ", setor=" + setor.getSetor() +
                ", SalarioBase=" + SalarioBase +
                '}';

        // salarioFinal + this.getSalarioFinal()
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return SalarioBase + (SalarioBase * PREMIO);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcionário contratado !");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionário demitido !");
    }
}
