public class Account {
    // Attribute
    private Customer owner;
    private int amount;
    private int accountID;

    // Constructor
    public Account(int accountID, int amount, Customer owner) {
        this.owner = owner;
        this.accountID = accountID;
        this.amount = amount;

    }

    // Methods
    public void transfer(Account transferAcc, int transf) {
        transferAcc.owner.setName("Barley");
        amount -= transf;
        transferAcc.amount += transf;


    }

    // Getter & setter
    public int getAmount() {
        return (this.amount);
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            System.out.println("No can do");
        } else {
            this.amount = amount;
        }
    }

    public Customer getOwner() {
        return this.owner;
    }

    public int getAccountID() {
        return this.accountID;
    }
}
