public class Account {
    // Attribute
    Customer owner;
    int amount;
    int accountID;

    // Constructor
    public Account(int accountID, int amount, Customer owner) {
        this.owner = owner;
        this.accountID = accountID;
        this.amount = amount;

    }

    // Methods
    public void transfer(Account transferAcc, int transf) {
        amount -= transf;
        transferAcc.amount += transf;


    }
}
