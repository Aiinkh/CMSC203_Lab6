
public class CheckingAccount extends BankAccount {
	
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		boolean completed = super.withdraw(amount + FEE);
		return completed;
	}

}
