package repository;

import domain.Animal;
import domain.Establo;

import java.util.ArrayList;
import java.util.List;

public class EstabloRepository {

    private Establo establo = new Establo();

    private static final EstabloRepository establoRepository = new EstabloRepository();

    private EstabloRepository() {
        establo.setNombreEstablo("Establo de don juan");
    }

    public static EstabloRepository getInstance() {
        return establoRepository;
    }

    public Establo getEstablo() {
        return establo;
    }
}
