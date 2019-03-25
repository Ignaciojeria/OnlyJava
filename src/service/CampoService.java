package service;

import domain.Animal;
import repository.AnimalRepository;
import repository.CampoRepository;

import java.util.ArrayList;
import java.util.List;

public class CampoService implements IRecoleccionAnimales {

    private final CampoRepository campoRepository;


    public CampoService(CampoRepository campoRepository) {
        this.campoRepository = campoRepository;
    }


    @Override
    public List<Animal> recogerAnimales() {
        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(campoRepository.getCampo().getAnimalsList());
        campoRepository.getCampo().getAnimalsList().removeAll(campoRepository.getCampo().getAnimalsList());
        System.out.println("Se han recogido los animales del banco de datos 'CampoRepository', dejando vacía su lista de animales");
        return animalList;
    }

    @Override
    public void agregarAnimales(List<Animal> animalList) {
        System.out.println("Has agregado una lista de animales al banco de datos 'CampoRepository'");
        campoRepository.getCampo().getAnimalsList().addAll(animalList);
    }



}
