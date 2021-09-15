package week1.day2;

public class MyMobile {
	String brand = "samsung";
	int cost = 23000;

	public void makeCall() {
		System.out.println("Call");
	}
	
	public void sendMsg() {
		System.out.println("Msg");
	}
	
	private void payBills() {
		System.out.println("pay bill");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Create package name as week1.day2
		 - Create a  new class as "MyMobile" under week2.day1
		 - create variables for the class
		 - Create 2 public methods (makeCall() , sendMsg()) with simple print statement
		 - Create a private method payBills() with simple print statement
		 - Create main method
		 - Create object for Mobile class and call the methods and variables using the object
		 - Execute the class and get the result in console
		 - Create a new class as MyKid in week2.day1 package
		 - Create an object for the previous class "MyMobile"
		 - Try to access all the 3 methods of class "MyMobile"
		 - Observe the access level of all the methods.( See if all the methods are called)
*/
	MyMobile sam = new MyMobile();
	String test = new String("Happy nEW");
	String test2 = new String ("Happy New");
	int len = test.length();
System.out.println(test+len);	
char c = test.charAt(4);
System.out.println(c);
int indexA = test.indexOf('p');
System.out.println(indexA);
		int lastindex = test.lastIndexOf('p');
		System.out.println(lastindex);
		
		String upper = test.toUpperCase();
		System.out.println("Uppercase: "+upper);
		
		String lower = test.toLowerCase();
		System.out.println("Lowercase: "+lower);
		
		String S = "test";
		String M = "test";
		char[] charArray = M.toCharArray();
syso		
	}

}
