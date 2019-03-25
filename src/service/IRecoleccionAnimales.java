package service;

import domain.Animal;

import java.util.List;

public interface IRecoleccionAnimales {

    public abstract List<Animal> recogerAnimales();

    public abstract void agregarAnimales(List<Animal> animalList);
}
