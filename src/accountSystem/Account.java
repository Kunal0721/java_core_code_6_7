package accountSystem;

enum AccountType {
	CURRENT, SAVING
}

public class Account {
	private String accountNumber;
	private String holderName;
	private double balance;
	private String pinNumber;
	private AccountType accountType;

	public void deposit(String accountNumber, String pinNumber, double amount) {
		if (this.accountNumber.equals(accountNumber) && this.pinNumber.equals(pinNumber)) {
			this.balance += amount;
			System.out.println("====================[ Deposit successfully..]===================");
		} else {
			System.out.println("Invalid account number or pin Number !!");
		}
	}
	
	public void transfer(double amount, Account other, String pinNumber) {
		if(this.pinNumber.equals(pinNumber)) {
			this.balance -= amount;
			other.setBalance(other.getBalance() + amount);
			System.out.println("==============[Transfer Successfully...]==================");
		}
		else {
			System.out.println("Invalid pin number..");
		}
	}

	public void withdrawl(String accountNumber, String pinNumber, double amount) {
		if (this.accountNumber.equals(accountNumber) && this.pinNumber.equals(pinNumber)) {
			if (this.balance > amount) {
				this.balance -= amount;
				System.out.println("====================[ Withdrawl successfully..]===================");
			} else {
				System.out.println("=============================[ Insufficient Balance ] =====================");
			}
		} else {
			System.out.println("Invalid account number or pin Number !!");
		}
	}

	public void display() {
		System.out.println("Account : ");
		System.out.println("\tAccount Number : " + accountNumber);
		System.out.println("\tAccount Holder name : " + holderName);
		System.out.println("\tBalance : " + balance);
		System.out.println("\tPin Number : " + pinNumber);
		System.out.println("\tAccount Type : " + accountType);
	}

	public Account(String accountNumber, String holderName, double balance, String pinNumber, AccountType accountType) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		this.pinNumber = pinNumber;
		this.accountType = accountType;
	}

	public Account() {
		super();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		if (!holderName.isBlank() && holderName.length() >= 3) {
			this.holderName = holderName;
		} else {
			System.out.println("Holder name should be greater then 3");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid balance !!");
		}
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		if (pinNumber.length() >= 4) {
			this.pinNumber = pinNumber;
		} else {
			System.out.println("Pin should be greater then 4...");
		}
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}
