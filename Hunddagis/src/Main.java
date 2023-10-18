import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Agare> owners = new ArrayList<>();

        owners.add(new Agare("Anna", 1234567));
        owners.add(new Agare("Marie", 98765));

        for (Agare owner : owners) {
            System.out.println(owner);
            System.out.println("has name " + owner.name);
            owner.addHund();
            System.out.println("and has dog: " + owner.hund.name);

        }
    }
}