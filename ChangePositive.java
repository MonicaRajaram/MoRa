package week1.day1;

public class ChangePositive {

	public static void main(String[] args) {
		/* 1. Initialize an integer with a negative number
   like, int number = -40;
2. Check if the number is a negative number 
   Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive numer

4. Print as below
        "The number -40 is converted to 40"
        //a-(a*2)


Problem statement: Check if the number is positive or negative
--------------------------------------------------------*/
		
		int num= -40;
	
		if (num<0)
		{ int val =Math.abs(num);
		System.out.println("the number is "+num+" converted to "+val);
		
		}
		else
			System.out.println("the number is positive");
	}

}
