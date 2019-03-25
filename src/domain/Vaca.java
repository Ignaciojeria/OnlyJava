package domain;

public class Vaca extends Animal {

    public static final String ESPECIE = "Bos primigenius taurus";

    @Override
    public void emitirSonido() {
        System.out.println("MUUUUUUUUU");
    }

}
