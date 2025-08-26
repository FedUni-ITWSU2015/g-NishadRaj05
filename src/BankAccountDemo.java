
public class BankAccountDemo {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount("78594", "Nishad Raj", 20000.0);
		
		System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Initial Balance: $" + acc.getBalance());
        
        acc.deposit(15000.0);
        System.out.println("Balance after deposit: $" + acc.getBalance());
        
        acc.withdraw(10000.0);
        System.out.println("Balance after withdrawal: $" + acc.getBalance());
        
        acc.withdraw(30000.0);
	}

}
