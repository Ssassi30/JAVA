package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;  // Attribut mis en 'private' pour respect de l'encapsulation
    private boolean isMammal;


    public Animal(String name, int age) {
        this.name = name;
        this.setAge(age); // Utilisation du setter pour validation
    }


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.setAge(age); // Utilisation du setter pour validation
        this.isMammal = isMammal;
    }


    public String getFamily() {
        return family;
    }


    public void setFamily(String family) {
        this.family = family;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif");
        }
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public boolean isMammal() {
        return isMammal;
    }


    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
}
