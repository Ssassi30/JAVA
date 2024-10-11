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

        Animal dog3 = new Animal("BERGER-ALLEMAND","TITOU",3,false);

        Zoo zoo1 = new Zoo("ariana","myzoo");
        //zoo1.displayZoo();

        zoo1.addAnimal(dog2);
        zoo1.addAnimal(dog3);
        //zoo1.displayZoo();
        System.out.println("Position de l'animal est  : " +zoo1.searchAnimal(dog3));

       // System.out.println(zoo1.toString());


    }


}

