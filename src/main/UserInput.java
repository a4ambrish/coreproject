package main;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String name;
		char a = 97;
		String b = "97";
		System.out.println(a);
		// DataInputStream dis = new DataInputStream(System.in);
		Scanner scanner = new Scanner(System.in);
		// read line from the User.
		name = scanner.nextLine();
		
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
			
			
				
				System.out.println("User input is Invalid");
				
			
		}
		
		System.out.println(name);
		scanner.close();
		
		
		
		
		
		//
		
		File f = new File("f:\\data.txt");
		
		Boolean existChk = f.exists();
		Boolean fileChk =  f.isFile();
		Boolean readChk=  f.canRead();
		
		
		if(existChk && fileChk && readChk ){
		System.out.println("File Content------------------");
		try {
			Scanner readFile = new Scanner(f);
		
			
			while(readFile.hasNextLine()){
				
				System.out.println(readFile.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else{
			
			System.out.println("File is not ready ");
			
		}
		
		

	}

}
