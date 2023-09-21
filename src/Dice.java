


import java.util.Random;

public class Dice {
    // Atrribute (egenskaper)
    int sides = 6;
    String colour = "red";
    int visibleNo = 1;

    // Constructor
    public Dice() {

    }

    public Dice(int newSides) {
        sides = newSides;
        colour = "green";

    }

    //Metoder (Aktiviteter)
    public void rollDice() {
        Random rand = new Random();
        visibleNo = rand.nextInt(sides) + 1;
        System.out.println("the dice has been rolled");

    }
}
