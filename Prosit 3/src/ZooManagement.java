import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Animal lion = new Animal("K-9","Bob",22,true);

        Animal chien = new Animal("chiouaoua", "WOU", 3, true);
        Animal serpent = new Animal("COBRA", "LAHNACH", 10, true);
        Zoo myZooTN = new Zoo("Belvedere","Tunis");
        Zoo myZooIT = new Zoo("RIVA-DG","italie");

        myZooTN.addAnimal(lion);
        myZooTN.addAnimal(chien);
        myZooIT.addAnimal(serpent);

        myZooTN.displayZoo();
        myZooIT.displayZoo();

        //System.out.println(myZoo);
        // Vérifier si un zoo est plein
        System.out.println("Le zooTN est plein : " + myZooTN.isZooFull());
        System.out.println("Le zooIT est plein : " + myZooIT.isZooFull());

        // Comparer les zoos
        Zoo largerZoo = Zoo.comparerZoo(myZooTN, myZooIT);
        System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.name);

    }


}
