/**
 * Class that manages Mammals
 */
public class Mammal extends Animal {
    private int age;

    /**
     * Constructor for Animal
     */
    public Mammal(String name, int age) {
        super(name);
        this.age = age;


    }

    /**
     * prints Mammal info
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("The mammal has the age " + age);
    }

}
