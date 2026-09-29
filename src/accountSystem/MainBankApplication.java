package accountSystem;

public class MainBankApplication {
	public static void main(String[] args) {
		
		Account a = new Account();
		a.setAccountNumber("BOI9834");
		a.setAccountType(AccountType.CURRENT);
		a.setBalance(10000);
		a.setPinNumber("1234asdf");
		a.setHolderName("Raj");
		
		a.display();
		a.withdrawl("BOI9834", "1234asdf", 50000);
		a.display();
		
		Account a2 = new Account();
		a2.setAccountNumber("BOI9123");
		a2.setAccountType(AccountType.CURRENT);
		a2.setBalance(19000);
		a2.setHolderName("Shivam");
		a2.setPinNumber("2234asf");
		
		a2.display();
		
		a.transfer(1000, a2, "1234asdf");
		
		a.display();
		a2.display();
	}
}