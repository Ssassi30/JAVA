package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected  Animal[] animals;  // Tableau d'animaux
    protected String name;
    protected String city;
    protected  static final int nbrCages = 25;

    // Constructeur pour initialiser le tn.esprit.gestionzoo.entities.Zoo
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide. Valeur ignorée.");
        }
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nom du zoo: " + name + "\nVille: " + city + "\nNombre de cages: " + nbrCages;
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {  // Si le zoo n'est pas plein
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;  // Ajout de l'animal
                    return true;  // Retourne true après avoir ajouté l'animal
                }
            }
        }

        // Si le zoo est plein ou aucune place n'a été trouvée
        System.out.println("Pas de place disponible pour l'animal.");
        return false;
    }


    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("----- Cages et animaux -----");

        for (int i = 0; i < nbrCages; i++) {
            System.out.print("Cage " + (i + 1) + ": ");
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            } else {
                System.out.println("Cage vide");
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;  // tn.esprit.gestionzoo.entities.Animal trouvé, retourner l'index
            }
        }
        return -1;  // tn.esprit.gestionzoo.entities.Animal non trouvé
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name.equals(animal.name)) {
                animals[i] = null;
                System.out.println("L'animal " + animal.name + " a été supprimé.");
                return true;
            }
        }
        System.out.println("tn.esprit.gestionzoo.entities.Animal non trouvé.");
        return false;
    }

    public boolean isZooFull() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                return false;
            }
        }
        return true;
    }

    public int ChargeZoo() {
        int C = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                C++;
            }
        }
        return C;
    }

    public Zoo compareZoo(Zoo zoo1, Zoo zoo2) {
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