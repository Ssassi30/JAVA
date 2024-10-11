public class Zoo {
    String name;
    String city;
    int nbrCages;
    Animal[] animals;

    // Constructeur par défaut
    public Zoo() {
    }

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages]; // Initialise le tableau d'animaux
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nbr Cages: " + nbrCages);
    }
}
