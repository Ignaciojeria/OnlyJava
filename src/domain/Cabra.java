package domain;

/* */
public class Cabra extends Animal {

    public static final String ESPECIE = "Capra aegagrus hircus";

    @Override
    public void emitirSonido() {
        System.out.println("AAAAAAAHH");
    }

}
