public class BankMain {
    public static void main(String[] args) {

        System.out.println("Hello Bank!");
        Customer cust = new Customer("Marley", 4711, 35, 789);
        int accID = 3;
        Account acc1 = new Account(accID, 500, cust);
        System.out.println("Account " + acc1.accountID + " has " + acc1.amount);

        Account acc2 = new Account(4, 1000000000, cust);
        System.out.println("Account " + acc2.accountID + " has " + acc2.amount);

        acc2.transfer(acc1, 1000000);
        System.out.println("Account " + acc1.accountID + " has " + acc1.amount);
        System.out.println("Account " + acc2.accountID + " has " + acc2.amount);

        System.out.println("the owner of the accuont " + acc1.accountID + " is " + acc1.owner.name);
    }
}