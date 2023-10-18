import java.util.Scanner;

public class Agare {
    String name;
    Hund hund;
    int telefon;

    public Agare(String name, int telefon) {
        this.name = name;
        this.telefon = telefon;
    }

    public void addHund() {
        Scanner scan = new Scanner(System.in);
        System.out.print("VAd heter hunden: ");
        String dogName = scan.nextLine();

        this.hund = new Hund(dogName, this);
    }
}
