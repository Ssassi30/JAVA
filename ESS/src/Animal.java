class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal;
    }
}


class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Redéfinition de toString() pour un affichage personnalisé
    @Override
    public String toString() {
        return "Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages;
    }
}



public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Zoo", "New York", 30);

        // Affichage via displayZoo()
        myZoo.displayZoo();

        // Affichage via toString()
        System.out.println(myZoo);  // Affiche correctement les informations
    }
}



