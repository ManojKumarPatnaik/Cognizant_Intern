public class SavingsAccount extends Account {

    private double minimumBalance;

    //Uncomment the getters and setters after writing the attributes
    public SavingsAccount(int accountNumber, Customer customerObj, double balance,double minimumBalance){
        super(accountNumber,customerObj,balance);
        this.minimumBalance=minimumBalance;
    }
    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    
    @Override
    public boolean withdraw(double amount){
        if(this.balance-amount>this.minimumBalance){
            this.setBalance(this.balance-amount);
            return true;
        }
        return false;
    }
    
}

    