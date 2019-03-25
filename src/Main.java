import domain.Animal;
import repository.AnimalRepository;
import repository.CampoRepository;
import repository.EstabloRepository;
import service.AnimalService;
import service.CampoService;
import service.EstabloService;
import service.IRecoleccionAnimales;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        IRecoleccionAnimales animales = new AnimalService(AnimalRepository.getInstance());
        IRecoleccionAnimales campo = new CampoService(CampoRepository.getInstance());
        IRecoleccionAnimales establo = new EstabloService(EstabloRepository.getInstance());

        animalList = animales.recogerAnimales();

        campo.agregarAnimales(animalList);

        animalList = campo.recogerAnimales();

        establo.agregarAnimales(animalList);


    }

}
