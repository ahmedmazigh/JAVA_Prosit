import java.util.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal wahch = new Animal("Lion", "nemr", 25, true);

        Zoo myZoo = new Zoo("Belvedere", "Tunis", 23);
        myZoo.appendAnimal(wahch);
        System.out.println(myZoo);
    }
}
