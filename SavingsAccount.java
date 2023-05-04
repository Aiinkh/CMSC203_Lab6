public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.025; // 2.5%
    private int savingsNumber;
    private String accountNumber;

    public SavingsAccount(String name, double balance) {
        super(name, balance);
        this.savingsNumber = 0;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * INTEREST_RATE / 12.0;
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public SavingsAccount(SavingsAccount original, double balance) {
        super(original, balance);
        this.savingsNumber = original.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
}
