class Zoo {
    Animal[] animals; // Tableau pour stocker les animaux
    String name;      // Nom du zoo
    String city;      // Ville où se trouve le zoo
    private final int nbrCages ;     // Nombre de cages

    // Constructeur pour initialiser le zoo
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
        animals = new Animal[nbrCages]; // Initialiser le tableau d'animaux
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo [Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages + "]";
    }

    // Méthode pour ajouter un animal au zoo
    boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà dans le zoo
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                System.out.println("L'animal " + animal.name + " existe déjà dans le zoo.");
                return false; // Retourner false si l'animal est déjà présent
            }
        }

        // Ajouter l'animal si une case vide est trouvée
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) { // Trouver une case vide
                animals[i] = animal;   // Ajouter l'animal
                return true;           // Retourner true si l'animal est ajouté avec succès
            }
        }

        System.out.println("Pas assez de cages disponibles pour ajouter " + animal.name);
        return false; // Retourner false si aucune case vide n'a été trouvée
    }

    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) { // Vérifier si l'animal est présent
                animals[i] = null; // Supprimer l'animal en le remplaçant par null
                System.out.println("L'animal " + animal.name + " a été supprimé du zoo.");
                return true; // Retourner true si la suppression a réussi
            }
        }

        System.out.println("L'animal " + animal.name + " n'a pas été trouvé dans le zoo.");
        return false; // Retourner false si l'animal n'est pas trouvé
    }

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
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in the Zoo:");
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) { // Vérifier si l'animal n'est pas null avant de l'afficher
                System.out.println("- " + animals[i].name);
            }
        }
    }
}
