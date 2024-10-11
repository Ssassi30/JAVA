package tn.esprit.gestionzoo.entities;

public class Animal {
     protected String type;
     protected String name;
      protected  int age;
     protected  boolean isMammal;

    public Animal(String type, String name, int age, boolean isMammal) {
        this.type = type;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Nom: " + name + ", Âge: " + age + ", Carnivore: " + isMammal;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge d'un animal ne peut pas être négatif. Valeur ignorée.");
        }
    }
}
