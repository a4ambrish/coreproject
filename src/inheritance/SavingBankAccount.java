package inheritance;

public class SavingBankAccount extends Account{

	float interest;
	
	@Override
public void deposite(int amt) throws IllegalAccessException{
		
	interest =  amt * 0.1f;
		bal = bal + interest+amt;
		System.out.println("Amount added into your account new balance is : " + bal + "  interest added by bank is : "+interest);
		
	}
	
	@Override
public void widthdra(int amt) throws IllegalAccessException{
		
	if(amt > bal){
		
		System.out.println("Insuffiecient Fund");
	return;	
	}
	
	bal = bal - amt;
	System.out.println("widthdra operation successful your new balance is : "+bal);
	
		
	}
	
}
