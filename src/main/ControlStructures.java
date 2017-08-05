package main;

public class ControlStructures {

	public static void main(String[] args) {
		int y = 6;
		int z = 10;
		int x = 15;
		int i = 5;
		int j = 6;
		int k = 7;
		int marks = 88;

		//
		/*
		 * 80-100 - A Grade 60-79 - B Grade 50- 59 - C Grade below 50 - failed
		 */
		//

		// If -- true ladded / false ladder / mixed ladder
		// Switch --- true ladded - < switch
		// For loop
		// while
		// do while loop

		if (marks < 0 || marks > 100) {

			System.out.println("Invalid Input");
		} else {

			if (marks >= 80) {

				System.out.println("A Grade");
			} else if (marks >= 60 && marks <= 79) {

				System.out.println("B Grade");
			} else if (marks >= 50 && marks <= 59) {

				System.out.println("C Grade");
			} else {

				System.out.println("Failed");
			}
		}
		
		ControlStructures obj = new ControlStructures();
		System.out.println(obj.findMonthNameSwitch(5));

	}

	private String findMonthName(int monthNumber) {

		if (monthNumber == 1) {

			return "Jan";
		} else if (monthNumber == 2) {

		} else if (monthNumber == 3) {

		} else if (monthNumber == 4) {

		} else if (monthNumber == 5) {

		} else if (monthNumber == 6) {

		} else if (monthNumber == 7) {

		} else if (monthNumber == 8) {

		} else if (monthNumber == 9) {

		} else if (monthNumber == 10) {

		} else if (monthNumber == 11) {

		} else if (monthNumber == 12) {

		}
		
		
		

		return null;
	}
	
	private String findMonthNameSwitch(int monthNumber) {

		String monthName = null;
		switch(monthNumber){
		
		case 1:
			monthName= "Jan";
			break;

		case 2:
			monthName= "Feb";
			break;

		case 3:
			monthName= "Mar";
			break;

		case 4:
			monthName= "APR";
			break;

		case 5:
			monthName= "May";
			break;

		case 6:
			monthName= "Jun";
			break;
			

		case 7:
			monthName= "Jul";
			break;

		case 8:
			monthName= "Aug";
			break;

		case 9:
			monthName= "Sep";
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
			default:
				
		}
		
		
		
		
		

		return monthName;
	}
}
