package week2.day3;

public class LearnCharacterOccurance {
	
	 
			
			/*
			 Pseudo Code
			 
			 * Declare String Input as Follow
			  
			 * String test = "changeme";
			 
			 * a) Convert the String to character array
			 
			 * b) Traverse through each character (using loop)
			 
			 * c)find the odd index within the loop (use mod operator)
			 
			 * d)within the loop, change the character to uppercase, if the index is odd else don't change
			  
			 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray = test.toCharArray();
		// System.out.println("character output"+charArray);
		for(int i=0;i<charArray.length;i++) {
			// System.out.println("char"+charArray[i]);
	//	System.out.println("\n Finding Oddindex with in loop\n");
			
		if ((i%2)!=0) {
	//	System.out.println("odd letters: "+charArray[i]);
		char upper = Character.toUpperCase(charArray[i]);
		System.out.println(upper);
		}
		
		}
		
	}

}
