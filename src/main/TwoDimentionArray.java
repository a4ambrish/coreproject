package main;

public class TwoDimentionArray {

	public static void main(String[] args) {

		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int [][]ans = new int[3][3];
		
		int [][][] threeD = new int [2][3][3];
		
		
		int [][][][] forD = new int [2][2][3][3];
		
		
		// find the no of elements can be store == 120
		// for nested loop will required to process 

		// to initialize 
//		for (int i = 0; i < 3; i++) {
//
//			for (int j = 0; j < 3; j++) {
//
//				mat1[i][j] = (int) (Math.random() * 5);
//				mat2[i][j] = (int) (Math.random() * 5);
//
//			}
//		}
		
		mat1[0][0]= 1;
		mat1[0][1]= 2;
		mat1[0][2]= 3;
		mat1[1][0]= 4;
		mat1[1][1]= 5;
		mat1[1][2]= 6;
		mat1[2][0]= 7;
		mat1[2][2]= 8;
		mat1[2][2]= 9;
		
		
		mat2[0][0]= 10;
		mat2[0][1]= 20;
		mat2[0][2]= 30;
		mat2[1][0]= 40;
		mat2[1][1]= 50;
		mat2[1][2]= 60;
		mat2[2][0]= 70;
		mat2[2][1]= 80;
		mat2[2][2]= 90;
		
		
		
		// initialize threeD
		for(int row=0; row<2; row++){
			
			
			// pic  mat1
			if(row == 0 ){
			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {
			
					threeD[row][i][j] = mat1[i][j];
				}
				
			}
			}
			// pic mat2
			if(row == 1 ){
			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {
			
					threeD[row][i][j] = mat2[i][j];
				}
				
			}
			}
			
		}
		
		
		
		// add two matrix
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
		
				ans[i][j] = mat1[j][i] + mat2[j][i];
			}
			
		}

	
// multiply two martix
		// Home Work
		//
		
		
		// To display mat1
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(mat1[i][j] + "\t");

			}
			System.out.println();
		}
		// To display mat2
		System.out.println("\n\n\n");
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				
				

				System.out.print(mat2[i][j] + "\t");

			}
			System.out.println();
		}

	
	
	// To display mat2
			System.out.println("\n\n Ans matrix \n");
			
			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {
					
					

					System.out.print(ans[i][j] + "\t");

				}
				System.out.println();
			}

		}

}
