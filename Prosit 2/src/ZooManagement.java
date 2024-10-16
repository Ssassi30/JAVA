import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Animal lion = new Animal("K-9","Bob",22,true);
        Zoo myZoo = new Zoo("Belvedere","Tunis",10);


        myZoo.displayZoo();


        System.out.println(myZoo);

    }


}
