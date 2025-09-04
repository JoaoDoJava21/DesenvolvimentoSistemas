package Atividade4;

public abstract class CargoDeConfiaca extends Funcionario {
    protected Bonificacao bonificacao ;

    public CargoDeConfiaca(String name, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(name, cpf, dataNascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

}
