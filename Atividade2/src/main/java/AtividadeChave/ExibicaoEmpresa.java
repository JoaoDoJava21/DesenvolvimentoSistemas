package AtividadeChave;

public class ExibicaoEmpresa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1 , "João" , 1500 , Setor.MARKETING, Sexo.MASCULINO , 18);
        Funcionario funcionario2 = new Funcionario(2 , "Daniel" , 2000 , Setor.FINANCEIRO, Sexo.MASCULINO , 25);
        Funcionario funcionario3 = new Funcionario(3 , "Fernanda" , 1250 , Setor.RECURSO_HUMANOS, Sexo.FEMININO , 17);

        System.out.println(funcionario);
        System.out.println(funcionario2);
        System.out.println(funcionario3);


    }
}
