package service;

import domain.Animal;
import repository.AnimalRepository;
import repository.EstabloRepository;

import java.util.ArrayList;
import java.util.List;

public class EstabloService implements IRecoleccionAnimales {

    private final EstabloRepository establoRepository;

    public EstabloService(EstabloRepository establoRepository) {
        this.establoRepository = establoRepository;
    }

    @Override
    public List<Animal> recogerAnimales() {
        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(establoRepository.getEstablo().getAnimalList());
        establoRepository.getEstablo().getAnimalList().removeAll(establoRepository.getEstablo().getAnimalList());
        System.out.println("Has recogido una lista de animales del banco de datos 'EstabloRepository'");
        return animalList;
    }

    @Override
    public void agregarAnimales(List<Animal> animalList) {
        establoRepository.getEstablo().getAnimalList().addAll(animalList);
        System.out.println("Has agregado animales al banco de datos 'EstabloRepository'. Ahora estos animales van a emitir un sonido");
        animalList.forEach(item -> {
            item.emitirSonido();
        });
    }

}
