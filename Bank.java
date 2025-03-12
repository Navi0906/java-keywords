class BankAccount {
    private static String bankName = "State Bank of India";
    private final int accountNumber;
    private static int totalAccounts = 0;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name: "+bankName);
            System.out.println("Account Name: "+accountNumber);
            System.out.println("Account Holder: "+accountHolderName);
            System.out.println("Balance: INR "+balance);
        }
    }

    public static void getTotalAccounts(){
        System.out.println("Total Bank Accounts: "+totalAccounts);
    }
}

public class Bank{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(204, "Dhruv", 3000000);
        BankAccount acc2 = new BankAccount(206, "Madhav", 5000000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
