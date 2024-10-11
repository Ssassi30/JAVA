public class Zoo {
    Animal[] animals;
    String city, name;
    static final int nbCages = 25;

    // Constructeur par défaut
    public Zoo() {
        this.animals = new Animal[nbCages];
    }

    // Constructeur paramétré
    public Zoo(String city, String name) {
        this.animals = new Animal[nbCages];
        this.city = city;
        this.name = name;
    }

    // Afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nombre de cages: " + nbCages);
        System.out.println("----- Cages et animaux -----");

        for (int i = 0; i < nbCages; i++) {
            System.out.print("Cage " + (i + 1) + ": ");
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            } else {
                System.out.println("Cage vide");
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCity: " + city + "\nNombre de cages: " + nbCages;
    }

    // Chercher un animal par son nom
    int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;  // Animal trouvé, retourner l'index
            }
        }
        return -1;  // Animal non trouvé
    }

    // Ajouter un animal dans une cage disponible
    boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal existe déjà.");
            return false;
        }

        // Vérifier s'il y a encore de la place dans le zoo
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }

        // Si toutes les cages sont pleines
        System.out.println("Le zoo est plein. Impossible d'ajouter de nouveaux animaux.");
        return false;
    }

    boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name.equals(animal.name)) {
                animals[i] = null;
                System.out.println("L'animal " + animal.name + " a été supprimé.");
                return true;
            }
        }
        System.out.println("Animal non trouvé.");
        return false;
    }

    boolean isZooFull() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                return false;
            }
        }
        return true;
    }

    int ChargeZoo() {
        int C = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                C++;
            }
        }
        return C;
    }

    Zoo compareZoo(Zoo zoo1, Zoo zoo2) {
        int chargeZoo1 = zoo1.ChargeZoo();
        int chargeZoo2 = zoo2.ChargeZoo();

        if (chargeZoo1 > chargeZoo2) {
            return zoo1;
        } else if (chargeZoo1 < chargeZoo2) {
            return zoo2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null; // ou zoo1/zoo2 si tu veux en retourner un même s'ils sont égaux
        }
    }

}
