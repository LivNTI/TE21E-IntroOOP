import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Creates a dice
        Dice myDice1 = new Dice();
        Dice myDice2 = new Dice();
        Dice myD20 = new Dice(20);


        System.out.println(" the visibleside for dice1 is " + myDice1.visibleNo);
        myDice1.rollDice();
        System.out.println(" the visibleside  for dice1 is " + myDice1.visibleNo);

        System.out.println(" the visibleside for dice2 is " + myDice2.visibleNo);
        myDice2.rollDice();
        System.out.println(" the visibleside for dice2 is " + myDice2.visibleNo);

        System.out.println(" the visibleside for d20 is " + myD20.visibleNo);
        myD20.rollDice();
        System.out.println(" the visibleside for d20 is " + myD20.visibleNo);

        /*
        Scanner scan= new Scanner(System.in);
        scan.nextLine();

         */


    }
}











