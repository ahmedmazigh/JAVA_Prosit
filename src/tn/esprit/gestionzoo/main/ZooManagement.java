package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Belvedere", "Tunis", 23);
        Animal lion = new Animal("Lion", "Simba", 5, true);
        Animal tiger = new Animal("Tiger", "Rajah", 4, true);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(lion));

        myZoo.showAnimals();

        System.out.println("Search 'Simba': " + myZoo.searchAnimal(lion));
        System.out.println("Removing 'Simba': " + myZoo.removeAnimal(lion));
        System.out.println("Removing 'Simba' again: " + myZoo.removeAnimal(lion));

        myZoo.showAnimals();
    }
}
