package Exercicio;

public enum Sexo {
    MASCULINO("Masculino")
    , FEMININO("Feminino") ;

    public String texto;

    public String getTexto() {
        return texto;
    }

    Sexo(String texto) {
        this.texto = texto;
    }
}
