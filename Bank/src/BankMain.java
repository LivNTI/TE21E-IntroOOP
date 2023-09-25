public class BankMain {
    public static void main(String[] args) {

        System.out.println("Hello Bank!");
        Customer cust = new Customer("Marley", 4711, 35, 789);
        Customer cust2 = new Customer("Barley", 4712, 35, 123);
        int accID = 3;
        Account acc1 = new Account(accID, 500, cust);
        System.out.println("Account " + acc1.getAccountID() + " has " + acc1.getAmount());

        Account acc2 = new Account(4, 10000, cust2);
        System.out.println("Account " + acc2.getAccountID() + " has " + acc2.getAmount());

        acc2.transfer(acc1, 100);
        System.out.println("Account " + acc1.getAccountID() + " has " + acc1.getAmount());
        System.out.println("Account " + acc2.getAccountID() + " has " + acc2.getAmount());

        acc2.setAmount(-300);

        System.out.println("the owner of the accuont " + acc1.getAccountID() + " is " + acc1.getOwner().getName());
        System.out.println("the owner of the accuont " + acc2.getAccountID() + " is " + acc2.getOwner().getName() + " and has " + acc2.getAmount());
    }
}