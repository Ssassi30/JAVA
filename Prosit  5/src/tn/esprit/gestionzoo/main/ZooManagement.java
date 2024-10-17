package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Aquatique;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        /*Animal lion = new Animal("K-9","Bob",22,true);

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
        System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.name);*/

        //Instance dolphin
        Dolphin dolphin = new Dolphin("dod",5,"ocean",20.5f);

        //Instance Penguin
        Penguin penguin = new Penguin("PING",3,"atlantique",30.0f);


        //Instance Terrestrial
        Terrestrial terrestrialAnimal = new Terrestrial("Elephant",10);

        //Instance Aquatique
        Aquatique aquticAnimal = new Aquatique("slim",2,"nasr");

        /*System.out.println("Dauphin: " + dolphin.getName() + ", Vitesse: " + dolphin.getSwimmingSpeed() + " km/h");
        System.out.println("Pingouin: " + penguin.getName() + ", Profondeur: " + penguin.getSwimmingDepth() + " mètres");
        System.out.println("Animal Terrestre: " + terrestrialAnimal.getName() + ", Pattes: " + terrestrialAnimal.getNbrLegs());*/

        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
        System.out.println(terrestrialAnimal.toString());

        aquaticAnimal.swim(); // Appelle swim() de Aquatic
        dolphin.swim();       // Appelle swim() de Dolphin (méthode redéfinie)
        penguin.swim();       // Appelle swim() de Aquatic (hérité)
    }




    }


}
