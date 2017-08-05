package main;
import java.util.Date;

// Pascal Notation == MyEmployee;  FileName/ClassName/Interface 
// Camal Notation = myColorObject; Object/Function Name/

/***
 * 
 * Java Docs Comment
 * 
 * @author Siva
 * @see for more information visit my site www.hhh.com
 * @version 1.0
 * 
 * */
public class SimpleClass {


	
	// POJO Plain Old Java Object / Bean
	private int xValue;  // default is 0
	private int yValue;
	
	private boolean flag; // default is false
	private String name; // default null
	private Date dojoining;  // 1/1/1900 , 1/1/1970 00:00:00 // current system date&time
	// Constructor in java
	// .. 
	
	
	// default construction, public / identical with class name/ must have no return type , not even void
		public SimpleClass(){
			System.out.println("Default const called");
			xValue = 100;
			yValue = 200;
		}
	
	// parameterized 
	/***
	 * you can provide your values to make this object
	 * */
	public SimpleClass(int p1, int p2, boolean flag, String name, Date dojoining) {
		super();
		System.out.println("Parameterized const called");
		xValue = p1;
		yValue = p2;
		this.flag = flag;
		this.name = name;
		this.dojoining = dojoining;
	}

	
	
	// copy const
	/***
	 * 
	 * this is the example of copy const.
	 * you need to pass an object of the same class and
	 * this method will copy into newly created class.
	 * 
	 * */
	public SimpleClass(SimpleClass temp) {
		super();
		
		System.out.println("Copy const called");
		xValue = temp.xValue;
		yValue = temp.yValue;
		this.flag = temp.flag;
		this.name = temp.name;
		this.dojoining = temp.dojoining;
	}
	
	
	public int getxValue() {
		return xValue;
	}
	
	public void setxValue(int xValue) {
		this.xValue = xValue;
	}
	public int getyValue() {
		return yValue;
	}
	public void setyValue(int yValue) {
		this.yValue = yValue;
	}

	@Override
	public String toString() {
		return "SimpleClass [xValue=" + xValue + ", yValue=" + yValue + ", flag=" + flag + ", name=" + name
				+ ", dojoining=" + dojoining + "]";
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDojoining() {
		return dojoining;
	}

	public void setDojoining(Date dojoining) {
		this.dojoining = dojoining;
	}
	
	
	
	
	
	
	
	
	
	
	
}
