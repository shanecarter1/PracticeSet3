/**
 * 
 */
import java.util.Date;
/**
 * @author Shane
 *
 */
public class Account {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account() {
	}
	
	public Account(int newId, double initialBalance) {
		this.id = newId;
		this.balance = initialBalance;
	}
	
	public int getID() {
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	void setID(int NewID){
		id = NewID;
	}
	
	void setBalance(double NewBalance){
		balance = NewBalance;
	}
	
	void setAnnualInterestRate(double NewRate){
		annualInterestRate = NewRate;
	}
	
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		double monthlyRate = (annualInterestRate)/12;
		return monthlyRate;
	}
	
	public void deposit(double depositAmount){
		balance += depositAmount;
	}
	public void withdraw(double withdraw) throws InsufficientFundsException {
		if (withdraw < balance){
			balance -= withdraw;
		}
		else{
			double debt = balance - withdraw;
			throw new InsufficientFundsException(debt);
			
			
		
	}
	
		
	
	
	
		
	
}
	
	
				
	
	
	
	
}
