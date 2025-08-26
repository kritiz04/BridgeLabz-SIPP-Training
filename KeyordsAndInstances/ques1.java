
class ques1 {

    static String bankName = "ABC National Bank";


    private static int totalAccounts = 0;


    private final int accountNumber;
    private String accountHolderName;
    private double balance;


    BankAccount(String accountHolderName, int accountNumber, double balance) {
        // Using 'this' to differentiate between instance variables and parameters
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;  
    }

 
    static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

       void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
            System.out.println("----------------------------");
        }
    }
}
