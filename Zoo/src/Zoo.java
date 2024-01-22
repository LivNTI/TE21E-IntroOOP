import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Klass för att hantera användar input i zooet
 *
 * @author liv.sundman
 */

public class Zoo {
    Animal ani = new Animal("Anakin");
    Mammal mami = new Mammal("mOTHER", 10);
    Scanner scan = new Scanner(System.in);

    public Zoo() {
        start();

    }


    /**
     * Intitierar programmet
     */
    public void start() {
        while (true) {
            System.out.println("do you want to print info of animal(1) or mammal(2)");

            try {
                int val = scan.nextInt();
                if (val < 1 || val > 2) {
                    throw new Exception("Exception message");
                }

                break;
            } catch (Exception error) {
                scan.nextLine();
                System.out.println("invalid choice");
                System.out.println("Please choos 1 or 2");
            }

        }


    }
}
