package Exercicio;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João" , "1203123-21" , "123123123" , Sexo.MASCULINO , 500.0 , "19/07/2004" , "21/08/2001" , "HSBA-R213" );
        Diretor diretor = new Diretor("Carlos" , "123123-23" , "1231232" , Sexo.MASCULINO , 1920.0 , "19/05/2007" , "21/05/2008" ,Bonificacao.DIRETOR);
        Gerente gerente = new Gerente("Ana" , "123123092-21" , "778453823" ,Sexo.FEMININO , 1400.0 , "28/02/2001" , "02/09/2001" , Bonificacao.GERENTE);

        System.out.println("\n" + motoboy);
        System.out.println("\n" + diretor);
        System.out.println("\n" + gerente);



    }
}
