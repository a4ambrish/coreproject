
package inheritance;

public class Bank {
	

	
	public static void main(String[] args) {
//		CurrentBankAccount account = new CurrentBankAccount();
//		
//		
//		account.setAccountNumber(1234);
//		account.setName("Ambrish");
//		account.setBal(1234.634f);
//		
//		account.printData();
//		
//		try {
//			account.widthdra(5000); // execute child class exclusive method
//			account.printData();
//			System.out.println("-------------------");
//			account.deposite(50000);
//			account.printData();
//			
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		SavingBankAccount sba = new SavingBankAccount();
		
		sba.setAccountNumber(100);
		sba.setName("Siva");
		sba.setBal(4500);
		
		
		sba.printData();
		
		try {
			sba.deposite(500);
			sba.printData();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
