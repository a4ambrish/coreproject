package main;

public class EnglishCheckException  extends Exception{

	String message;
	String timeOfException;
	
	public EnglishCheckException(){
		
		
	}
	
public EnglishCheckException(String message, String time){
	this.message = message;
	this.timeOfException = time;
	
}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimeOfException() {
		return timeOfException;
	}
	public void setTimeOfException(String timeOfException) {
		this.timeOfException = timeOfException;
	}
	
	
	
}
