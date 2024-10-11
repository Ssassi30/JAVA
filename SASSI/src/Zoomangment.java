import java.util.Scanner;

public class Zoomangment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Merci de saisir le nbr des cages : ");
        //int nbrCages= scanner.nextInt();
        // System.out.println("Merci de saisir le nom de zoo : ");
        // String zooName= scanner.next();
        //System.out.println(zooName+" comporte" +nbrCages + " cages" );
        Zoo myZoo = new Zoo();

        Animal dog2 = new Animal("K-9","CARA",2,true);

        Animal dog3 = new Animal("SALLOUMTI","sassi",3,true);
        Animal salima = new Animal("chiouaoua","salima",1,true);

        Zoo zoo1 = new Zoo("ariana","myzoo");

        zoo1.AddAnimal(dog2);
        zoo1.AddAnimal(dog3);
        zoo1.AddAnimal(salima);
        zoo1.AddAnimal(salima);
        zoo1.displayZoo();

    }


}
