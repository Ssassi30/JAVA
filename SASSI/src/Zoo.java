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

    // Méthode pour rechercher un animal
    int searchAnimal(Animal a) {
        for (int i = 0; i < nbCages; i++) {
            if (animals[i] != null && animals[i].name.equals(a.name)) {
                return i;
            }
        }
        return -1;
    }

    // Méthode pour ajouter un animal dans une cage
    boolean AddAnimal(Animal a) {
        if (searchAnimal(a) != -1) {
            System.out.println("L'animal existe deja ");
            return false;
        }

        // Chercher une cage vide et ajouter l'animal
        for (int i = 0; i < nbCages; i++) {
            if (animals[i] == null) {
                animals[i] = a;
                return true;
            }
        }

        // Il n'y a pas de cages disponibles
        return false;
    }

    boolean RemoveAnimal(Animal a) {
        if (searchAnimal(a) != -1) {
            animals[searchAnimal(a)] = null;
            return true;
        }
        return false;
    }

    boolean isZooFull() {
        for (int i = 0; i < nbCages; i++) {
            if (animals[i] == null) {
                return false; // Une cage vide a été trouvée
            }
        }
        return true; // Toutes les cages sont pleines
    }


    Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        boolean isZoo1Full = zoo1.isZooFull();
        boolean isZoo2Full = zoo2.isZooFull();

        if (isZoo1Full && !isZoo2Full) {
            return zoo1; // zoo1 est plein, zoo2 ne l'est pas
        } else if (!isZoo1Full && isZoo2Full) {
            return zoo2; // zoo2 est plein, zoo1 ne l'est pas
        } else {
            System.out.println("Les deux zoos sont égaux en termes de remplissage.");
            return zoo1; // ou zoo2, selon vos besoins
        }
    }





}
