package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Dolphin;

public class ZooManagement {
    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic("Fish", "houta", 2, true, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Dog", "kalb", 3, true, 4);
        Dolphin dolphin = new Dolphin("Dolphin", "dolfino", 5, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Penguin", "minou", 4, true, "Antarctic", 100.0f);

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();

    }
}
