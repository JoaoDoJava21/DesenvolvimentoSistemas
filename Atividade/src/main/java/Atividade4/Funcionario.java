package Atividade4;

public class Funcionario implements SalarioFinal{
    protected String name;
    protected String cpf ;
    protected String dataNascimento;
    protected double salarioBase;

    public Funcionario(String name, String cpf, String dataNascimento, double salarioBase) {
        this.name = name;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salarioBase = salarioBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }


    @Override
    public double obterSalarioFinal() {
        return 0;
    }
}
