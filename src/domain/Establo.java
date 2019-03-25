package domain;
import java.util.ArrayList;
import java.util.List;

public class Establo {

    private String id;

    List<Animal> animalList = new ArrayList<>();

    private String nombreEstablo;

    public Establo(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public String getNombreEstablo() {
        return nombreEstablo;
    }

    public void setNombreEstablo(String nombreEstablo) {
        this.nombreEstablo = nombreEstablo;
    }
}
