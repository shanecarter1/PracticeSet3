
public class Test {

	public static void main(String[] args) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		Account a = new Account(1122,20000);
		a.setAnnualInterestRate(4.5);
		a.deposit(3000);
		try {
		a.withdraw(2500);
		} catch(InsufficientFundsException e) {
		System.out.println("you are short $" + e.getAmount());
		}
		
		
		System.out.println(a.getBalance());
		System.out.println(a.getMonthlyInterestRate());
		System.out.println(a.getDateCreated());
		
		
		
	}

}
