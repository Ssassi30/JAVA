package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String name, int age, String habitat, float swimmingSpeed) {
        super(name, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Méthode swim() dans Dolphin, redéfinie pour Dolphin
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin [Name=" + getName() + ", Age=" + getAge() + ", Habitat=" + getHabitat() +
                ", Swimming Speed=" + swimmingSpeed + " km/h]";
    }
}
