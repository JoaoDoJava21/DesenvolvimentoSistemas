package Atividade4;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João" , "109432678-21" , "18/02/2007" , 500.0 );
        Motoboy motoboy = new Motoboy("Ana" , "109213231-21" , "10/06/2000" , 4500.0 ,"HSA2-0B8");

        System.out.println(gerente);
        System.out.println(motoboy);

        gerente.admitir(motoboy);
        gerente.admitir(gerente);
    }
}
