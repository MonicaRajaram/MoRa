package week1.day1;

public class LearnIfCondition {

	public static void main(String[] args) {
		/* num = 15
		div by 3 - print Trizz
		div by 5 - print Fizz
		div by 3 & 5 - print Trizz and Fizz num%3==0 && num%5==0 */
		
		int num = 27;
		if (num%3==0 && num%5 == 0) 
			System.out.println("Trizz & Fizz!");
			else if(num%5==0)
				System.out.println("Fizz!");
			else if(num%3 == 0 ) 
			System.out.println("Its a Trizz!");
	}
}
