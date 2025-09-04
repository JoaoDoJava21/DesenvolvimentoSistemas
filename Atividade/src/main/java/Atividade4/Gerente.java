package Atividade4;

public class Gerente extends Funcionario implements Contratacao{
    public Gerente(String name, String cpf, String dataNascimento, double salarioBase) {
        super(name, cpf, dataNascimento, salarioBase);
    }


    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcionário Admitido: " + funcionario.name);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionário Demitido : " + funcionario.name);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
