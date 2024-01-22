/**
 * Class for everythign animals have in common
 */

public class Animal {
    private String name;

    /**
     * Constructor for Animal
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Prints the animals name
     */
    public void printInfo() {
        System.out.println("The animal is called " + this.name);
    }
}
