package ClassePessoa;
import java.util.Scanner;


public class MainPessoa {
    public static void main(String[] args) {


        // Exibindo dados diretamente no Construtor
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa(15,"João");

        System.out.println(pessoa);
        System.out.println();
        System.out.println("Meu código é " +pessoa.getCodigo() + " e meu nome é: " + pessoa.getNome());



    }
}
