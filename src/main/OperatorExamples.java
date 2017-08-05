package main;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class OperatorExamples {

	public static void main(String[] args) {
		
		// Operators are special symbols in java
		/*
		 * Category of operators
		 * A) Based on operands
		 * 
		 * 
		 * */
		OperatorExamples obj  = new OperatorExamples();
		
		//obj.test(x, y);
		
		int i;
		int j=0;
		int k=0;
		
		i = j + k;
		
		// + is a binary operators
		// operators has assosiativity
		// = assignment opertaor;
		// right to left
		// precedents 
		//
		
		//--------
		// unary operators in java
		// ++,--
		//post / pre
		
		i = k++;
		System.out.println(i);
		System.out.println(k);
		System.out.println("--------------");
		i = ++j;
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
		
		
		// binary opreators
		// Arithmatic  +,-,/,%(Mod)
		// Relational Operatios &&(and) , || (or)
		// && == T && T = True 
		//       F && T = False
		// Logical Operators = >,<,<=,>=,==,!=
		// output of is boolean values i.e true/false
		// ! = Not only flip the boolean value, required only one operand
		// Bitwise operator 
		
		// &,|,>>,<<
		
		
		// 10 in binary
		//  2^3 +bit * 2^2 +bit * 2^1 +bit * 2^0 +
		//  1001
		// 1*2^3 +0 * 2^2 +0 * 2^1 +1 * 2^0 
		//                      8+0+0 +1
		// 9
		//
		//  0101 == 5
		//+ 1100==  12
		//----------
		//   10001 == 17
		/*
		 * 0 = 0000
		 * 1 = 0001
		 * 2=  0010
		 * 3= 0011
		 * 4= 0100
		 * 5= 0101
		 * 6= 0110
		 * 7 = 0111
		 * 8 = 1000
		 * 9= 1001
		 * 10 = 1010
		 * 11 = 1011
		 * 12 = 1100
		 * 13 = 1101
		 * 14 = 1110
		 * 
		 *  1100101 = > 101
		 *  101010101011 = 
		 * 
		 * 
		 * 650000
		 * 1111111111111111 = 
		 * 
		 * 
		 * */
		// -5 to +4
		// 9
		// 8 
		// 3
		
		// ternary operator
		
		
		
		
		int y = 6;
		int z = 10;
		int x = 15;
		i = 5;
		j = 6;
		k = 7;
//i = 2731;

//k = i<<2;
System.out.println("-----------   "+k);

if ( ! ((i<j && j>k )   && (i!= z) || (x+i )< k+y || true)){
	
	System.out.println("Apple");
}else{
	
	System.out.println("banana");
}
	
System.out.println(! ((i<j && j>k )   && (i!= z) || (x+i )< k+y || true)?"apple":"banana");

x = i<z ? 100: 200;
// cond?truepart:falsepart;

System.out.println("x- -------->" +x);


	System.out.println(i>z ? (i<x ?"Apple":"banana22") :"grapes");
	}
	


	/*
	 * Internal Documents
	 * 
	 * */
	
	/**
	 * @author ambrish
	 * @return
	 * @param x means firts and y means second
	 * */
	private void test(int x, int y){
		
		//asdfas
		/*
		 * 
		 * 
		 * */
		
		
	}
	
}
