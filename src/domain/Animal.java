package domain;

/*Clase Abstracta que si puede ser instanciada con una clase anonima */
public abstract class Animal {

    private String id;

    private Double peso;

    public Animal(){}

    public abstract void emitirSonido();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
