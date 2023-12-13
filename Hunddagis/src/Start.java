import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    ArrayList<Agare> owners = new ArrayList<>();

    private Scanner scan = new Scanner(System.in);

    public Start() {

        createOwner();
        createOwner();


        //owners.add(new Agare("Anna", 1234567));
        //owners.add(new Agare("Marie", 98765));

        for (Agare owner : owners) {
            System.out.println(owner);
            System.out.println("has name " + owner.name);

            System.out.println("and has dog: " + owner.hund.name);

        }
    }

    private void createOwner() {
        System.out.print("name; ");
        String name = scan.nextLine();
        System.out.print("num; ");
        int num = scan.nextInt();
        scan.nextLine();

        Agare owner = new Agare(name, num);
        owner.addHund();

        owners.add(owner);
    }
}
