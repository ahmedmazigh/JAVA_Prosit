import java.util.Arrays;

public class Zoo {
	Animal [] animals;
	String name;
	String city;
	int nbrCages;

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = Math.min(nbrCages, 25);
    }

    Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[Math.min(nbrCages, 25)];
        this.name = name;
        this.city = city;
        this.nbrCages = Math.min(nbrCages, 25);
    }

    public void appendAnimal(Animal animal) {
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == null) {
                this.animals[i] = animal;
                break;
            }
        }
    }

    public void showAnimals() {
        System.out.println("-----------------");
        for (Animal animal : this.animals) {
            animal.showAnimal();
            System.out.println("-----------------");
        }
    }

    public void displayZoo() {
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
