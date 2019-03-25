package domain;

public class Oveja extends Animal {

    public static final String ESPECIE= "Ovis orientalis aries";

    @Override
    public void emitirSonido() {
        System.out.println("BEEEEEEEE");
    }

}
