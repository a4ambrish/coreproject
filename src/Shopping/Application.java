package Shopping;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int mainMenu = 1;
		int subMenu = 0;

		do {
			subMenu = displayMainMenu();
			
			switch (subMenu) {
			case 1:
				
				
				mainMenu = displayCustomerMenu();
				
				if(mainMenu == 1){
					System.out.println("Call List Function here........ UnderDevelopment");
					
				}
				if(mainMenu == 2){
					System.out.println("Call Find By ID Function here........ UnderDevelopment");
					
				}
				if(mainMenu == 3){
					System.out.println("Call Edit Customer Function here........ UnderDevelopment");
					
				}
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				
				break;

			}

		} while (mainMenu != 0);
System.out.println("Application Shutdown Successfully \n\n\n Good Bye !!!\n");

	}

	private static int displayMainMenu() {
		System.out.println("------------------Main Menu---------------------");
		System.out.println("[1] Customer Menu");
		System.out.println("[2] Author Menu");
		System.out.println("[3] Book Menu");
		System.out.println("[4] Order Menu");
		System.out.println("[0] Exit");
		System.out.println("Enter Your Choice : ");
		Scanner obj  = new Scanner(System.in);
		int subMenu = obj.nextInt();
		return subMenu;
	}

	private static int displayCustomerMenu() {
		System.out.println("------------------Main Menu---------------------");
		System.out.println("[1] List ALL Customer");
		System.out.println("[2] Find By ID ");
		System.out.println("[3] Edit Customer Details");
		System.out.println("[4] Delete Customer");
		System.out.println("[0] Exit");
		System.out.println("Enter Your Choice : ");
		Scanner obj  = new Scanner(System.in);
		int subMenu = obj.nextInt();
		return subMenu;

	}

}
