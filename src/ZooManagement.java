import java.util.*;

public class ZooManagement {
    public static void main(String[] args) {

        String nbrCages;
        String zooName;

        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer nom zoo: ");
        zooName = reader.next();
        do {
            System.out.println("Entrer nbr cages: ");
            nbrCages = reader.next();
        }
        while(!nbrCages.matches("[0-9]+"));

        // System.out.println("Entrer nbr cages: ");
        // int nbrCages = reader.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }

}
