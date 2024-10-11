import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        // Créer des objets Animal
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal dog = new Animal("Canidae", "Dog", 3, true);
        Animal cat = new Animal("Felidae", "Cat", 2, true);
        Animal cow = new Animal("Bovidae", "Cow", 4, true);

        // Créer un objet Zoo
        Zoo zoo1 = new Zoo("Belvedere", "Tunis", 5);

        // Afficher les informations du zoo
        zoo1.displayZoo();
    }
}
