package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private static final int NBR_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[animalCount++] = animal;
        return true;
    }

    public void showAnimals() {
        System.out.println("Animals in " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        animals[index] = animals[--animalCount];
        animals[animalCount] = null;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount >= z2.animalCount ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', animals=" + Arrays.toString(animals) + "}";
    }
}
