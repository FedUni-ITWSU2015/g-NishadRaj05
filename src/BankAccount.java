
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
    
}
