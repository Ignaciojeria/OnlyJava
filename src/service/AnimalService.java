package service;

import domain.Animal;
import repository.AnimalRepository;

import java.util.ArrayList;
import java.util.List;

public class AnimalService implements IRecoleccionAnimales {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public List<Animal> recogerAnimales() {
        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(animalRepository.getAnimalList());
        animalRepository.getAnimalList().removeAll(animalRepository.getAnimalList());
        System.out.println("Has recogido los animales creados en el banco de datos de 'AnimalRepository' dejando vacía su lista de animales");
        return animalList;
    }

    @Override
    public void agregarAnimales(List<Animal> animalList) {
        animalRepository.getAnimalList().addAll(animalList);
    }

}
