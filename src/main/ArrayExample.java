package main;
import java.util.Date;

public class ArrayExample {

	public static void main(String[] args) {
		
		

		// int[] numbers = new int[100];
		//
		// for (int i = 0; i <= 99; i++) {
		//
		// numbers[i] = i + 1;
		//
		// }
		//
		// numbers[50] = 50;
		//
		// for (int i : numbers) {
		//
		// System.out.println(i);
		// }
		//
		//
		// int temp = numbers[99];
		// //numbers[99] = numbers[0];
		//
		// for (int i = 0; i < 99; i++) {
		//
		//
		// numbers[i] = numbers[i+1];
		//
		//
		// }
		// numbers[99] = temp;
		// System.out.println("---------------");
		// for (int i : numbers) {
		//
		// System.out.println(i);
		// }
		//

		int[] mover = new int[10];
		int[] firstHalf = new int[5];
		int[] secondHalf = new int[5];

		for (int i = 0; i < 10; i++) {
			mover[i] = i + 1;
		}
		int j = 5;
		int index = 0;
		for (;index<5;) {
			
				firstHalf[index] = mover[index];
		     	secondHalf[index] = mover[j];
		     	index++;
		     	j++;
		}
		
		
		
		
		for (int i : mover) {

			System.out.println(i);
		}

		System.out.println("#######################");
		for (int i : firstHalf) {

			System.out.println(i);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		for (int i : secondHalf) {

			System.out.println(i);
		}
		
		
		int temp = mover[9];
		for (int i = 9; i > 0; i--) {

			mover[i] = mover[i - 1];

		}
		mover[0] = temp;
		System.out.println("******************");
		for (int x : mover) {

			System.out.println(x);
		}
//just give in 1 minute, 
		
		Date d = new Date();
		
		System.out.println(d.getTime());
		SimpleClass tempObj = new SimpleClass(); 
		SimpleClass obj = new SimpleClass(200, 500, true, "Ambrish", new Date());
		SimpleClass obj2 = new SimpleClass(obj);
		
		
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		System.out.println(tempObj.toString());
	}

}
