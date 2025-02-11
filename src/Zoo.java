import java.util.Arrays;

public class Zoo {
    private static final int NBR_CAGES = 25; // Constant max capacity
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount; // Tracks current number of animals

    Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
        this.animalCount = 0;
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
            if (animals[i].name.equals(animal.name)) {
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
