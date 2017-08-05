package main;
import java.io.FileNotFoundException;
import java.time.format.TextStyle;
import java.util.Date;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			callMethod(4,0);  // actual parameter
			
		}
		catch (EnglishCheckException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured "+e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured "+e.getMessage());
		}finally{
			
			System.out.println("Evergreen statements");
		}
		
		try {
			
			callMethod("Ambrish&");
		}
		catch (EnglishCheckException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured "+e.getMessage()+ "  Time of Exception  "+ e.getTimeOfException());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured "+e.getMessage() );
		}
		
		
	}
	
	

	
	private static void callMethod(int i, int j) throws Exception
	{
		
		testException(i,j);
	}
	
	private static void callMethod(String name) throws EnglishCheckException,ArithmeticException,FileNotFoundException
	{
		
		byte [] data = name.getBytes();
		boolean isValid = Boolean.TRUE;
		for(byte bty : data){
			if(!((bty <= 91 && bty >= 65)   || (bty <= 122 && bty >= 97) || (bty <= 57 && bty >= 48) ))
			{
				
				isValid =  Boolean.FALSE;
				
			}
		}
		
		if(isValid){
			
			System.out.println("User input is OK");
			
		}else{
			
			// regluar way of returning / throwing message
			EnglishCheckException error = new EnglishCheckException();
			error.setMessage("Invalid Text String passed");
			error.setTimeOfException(new Date().toString());
			throw error;
			
			
			// shortcut
			//throw new EnglishCheckException("Invalid" , new Date().toString());
				
			
		}
	}
	
	private static void testException(int x, int y) throws ArithmeticException
	{
		
		//
		//
		///
		///
		if(y==0){
		throw new ArithmeticException("Can not divide by zero");
		}
		System.out.println("divide x / y ");
		System.out.println(x/y);
		
	}
	
}
