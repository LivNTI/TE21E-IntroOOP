public class Customer {
    // Attributes
    private String name;
    private long id;
    private int age;
    private int bankID;

    // Constructors
    public Customer(String name, long id, int age, int bankID) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.bankID = bankID;
    }

    // getter

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
