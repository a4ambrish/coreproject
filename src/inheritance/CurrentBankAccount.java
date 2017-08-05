package inheritance;

public class CurrentBankAccount extends Account{

	float overdraftAmt;
	

	@Override
public void deposite(int amt) throws IllegalAccessException{
		
	if(overdraftAmt > 0 ){
		if(amt > overdraftAmt){
		bal = bal +amt - overdraftAmt ;
		overdraftAmt = 0.0f;
		}else{
			
			System.out.println("Please deposit minimum of : "+overdraftAmt);
			return ;
			
		}
		
	}
		System.out.println("Amount added into your account new balance is : " + bal );
		
	}
	
	@Override
public void widthdra(int amt) throws IllegalAccessException{
		
	if(amt > bal){
		overdraftAmt = amt - bal;
		System.out.println("Withdrawal with Overdraft facility ");
	}
	
	bal = bal - amt;
	System.out.println("widthdra operation successful your new balance is : "+bal);
	
		
	}
	
}
