package Atividade3;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("João" , "19/07/2007" , Sexo.MASCULINO , Setor.OPERACOES ,5000.0 );
        Motoboy motoboy = new Motoboy("Julia" , "18/07/2004" , Sexo.FEMININO , Setor.OPERACOES , 4000.0 , "Não Habilitada");

        System.out.println("Diretor: " + diretor);
        System.out.println("Motoboy: " + motoboy);
        diretor.admitir(motoboy);
        diretor.demitir(motoboy);
     }
}

