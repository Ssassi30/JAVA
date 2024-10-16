package tn.esprit.gestionzoo.entities;

public class Animal {
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

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age <0)
        {
            throw new IllegalArgumentException("L'age ne peut pas etre negatif");
        }
        this.age = age;
    }
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public boolean isMammal() {
        return isMammal;
    }

}
