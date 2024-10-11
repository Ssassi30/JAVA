package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement ZooManagement = new ZooManagement();

        // Initialisation correcte du tn.esprit.gestionzoo.entities.Zoo avec le nombre de cages
        Zoo myZoo = new Zoo("Belvedere", "Tunis");

        // Création d'un animal
        Animal lion = new Animal("K-9", "Zeineb", 2, true);

        // Ajout de l'animal au zoo
        myZoo.addAnimal(lion);


        // Affichage des informations du zoo
        ZooManagement.DisplayInfo();
    }

    public void DisplayInfo() {
        System.out.println("Le zoo " + zooName + " comporte " + nbrCages + " cages.");
    }

    public void getUserInput() {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Entrez le nom du zoo : ");
        zooName = Scan.nextLine();

        System.out.println("Entrez le nombre de cages : ");

        while (!Scan.hasNextInt()) {
            System.out.println("Entrez un nombre valide de cages : ");
            Scan.nextLine();
        }

        nbrCages = Scan.nextInt();

        Scan.close();
    }
}
