
public class BankAccountDemo {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount("78594", "Nishad Raj", 20000.0);
		
		System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Initial Balance: $" + acc.getBalance());
	}

}
