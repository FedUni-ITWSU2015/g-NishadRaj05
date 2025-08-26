
public class BankAccount {
	
	private double accountBalance;
    private String accountNumber;
    private String accountHolderName;
    
    public BankAccount(String number, String holderName, double initialBalance) {
    	accountBalance = initialBalance;
    	accountNumber = number;
    	accountHolderName = holderName;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Not Enough Funds!! Withdrawal denied.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    
    public double getBalance() {
        return accountBalance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

}
