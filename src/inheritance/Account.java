package inheritance;

public abstract class Account {

//	int accountNumber;
	// wrapper class
	String name;
	Float bal;
	
	//
	Integer accountNumber;
	
	public int getAccountNumber() {
		// Auto-Unboxing
	return accountNumber;//
		//return accountNumber.intValue();
	}
	public void setAccountNumber(int accountNumber) {
		// 1.5 Auto-Boxing
		this.accountNumber = accountNumber;
		//this.accountNumber.valueOf(accountNumber);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBal() {
		return bal;
	}
	protected void setBal(float bal) {
		this.bal = bal;
	}
	
	public void printData(){
		
		System.out.println("accountNumber : "+accountNumber);
		System.out.println("name : "+name);
		System.out.println("bal : "+bal);
	}
	
	
	public void deposite(int amt) throws IllegalAccessException{
		
		throw new IllegalAccessException("Please call this method on my child classes");
		
		
	}
	
public void widthdra(int amt) throws IllegalAccessException{
		
		throw new IllegalAccessException("Please call this method on my child classes");
		
		
	}
}
