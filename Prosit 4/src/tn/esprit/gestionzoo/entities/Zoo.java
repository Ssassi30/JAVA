package tn.esprit.gestionzoo.entities;

public class Zoo {
     public Animal[] animals;
     public String name;
     public String city;
     public final int nbrCages;

    // Constructeur pour initialiser le zoo
    public Zoo(String name, String city) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne doit pas être vide.");
        }
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
        animals = new Animal[nbrCages];
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages + "]";
    }

    // Getter pour le nom du zoo
    public String getName() {
        return name;
    }

    // Méthode pour ajouter un animal au zoo
    public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            System.out.println("Impossible d'ajouter " + animal.getName() + ": le zoo est plein.");
            return false; // Retourner false si le zoo est plein
        }

        // Vérifier si l'animal existe déjà dans le zoo
        for (Animal a : animals) {
            if (a != null && a.getName().equals(animal.getName())) {
                System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo.");
                return false;
            }
        }

        // Ajouter l'animal si une case vide est trouvée
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("L'animal " + animal.getName() + " a été ajouté au zoo.");
                return true;
            }
        }

        System.out.println("Pas assez de cages disponibles pour ajouter " + animal.getName());
        return false; // Retourner false si aucune case vide n'a été trouvée
    }

    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) { // Vérifier si l'animal est présent
                animals[i] = null;
                System.out.println("L'animal " + animal.getName() + " a été supprimé du zoo.");
                return true;
            }
        }

        System.out.println("L'animal " + animal.getName() + " n'a pas été trouvé dans le zoo.");
        return false; // Retourner false si l'animal n'est pas trouvé
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        for (Animal animal : animals) {
            if (animal == null) { // Si une case est vide, le zoo n'est pas plein
                return false;
            }
        }
        return true; // Si aucune case n'est vide, le zoo est plein
    }

    // Méthode pour comparer deux zoos et retourner celui avec le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int countZ1 = 0;
        int countZ2 = 0;

        // Compter les animaux dans le premier zoo
        for (Animal animal : z1.animals) {
            if (animal != null) {
                countZ1++;
            }
        }

        // Compter les animaux dans le deuxième zoo
        for (Animal animal : z2.animals) {
            if (animal != null) {
                countZ2++;
            }
        }

        // Retourner le zoo avec le plus d'animaux
        return countZ1 >= countZ2 ? z1 : z2;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in the tn.esprit.gestionzoo.entities.Zoo:");
        for (Animal animal : animals) {
            if (animal != null) { // Vérifier si l'animal n'est pas null avant de l'afficher
                System.out.println("- " + animal.getName());
            }
        }
    }
}
