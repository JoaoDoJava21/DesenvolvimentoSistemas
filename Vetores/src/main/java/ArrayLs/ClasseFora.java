package ArrayLs;

public class ClasseFora {
    private String name ;
    private int idade ;
    private Double alt ;

    public ClasseFora(){

    }

    public ClasseFora(String name , int idade , Double alt) {
        this.name = name;
        this.idade = idade;
        this.alt = alt ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAlt() {
        return alt;
    }

    public void setAlt(Double alt) {
        this.alt = alt;
    }

    @Override
    public String toString(){
        return "Nome: " + name + " Idade: " + idade + " Altura: " + alt ;
    }
}
