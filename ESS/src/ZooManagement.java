import java.util.Scanner;

public class ZooManagement {

    int nbrcages=20;
    String zooName="my zoo";

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo:");
        zooManagement.zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages:");

        while(!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide pour le nombre de cages");
            scanner.next();
        }
        zooManagement.zooName = scanner.nextLine();
        System.out.print(zooManagement.zooName + " comporte " + zooManagement.nbrcages + " cages");

        scanner.close();
    }
}
