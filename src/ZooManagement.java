import java.util.*;

public class ZooManagement {
    public static void main(String[] args) {

        int nbrCages;
        String zooName;

        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer nom zoo: ");
        zooName = reader.next();
        System.out.println("Entrer nbr cages: ");
        while(!reader.hasNextInt()) {
            System.out.println(" Valeur invalide");
            reader.next();
        }
        nbrCages = reader.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }

}
