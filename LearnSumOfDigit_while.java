package week1.day2;

public class LearnSumOfDigit_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1895;
int quotient=0,remainder=0,sum=0;

while (num!=0) {
	quotient = num/10;
	remainder = num%10;
	sum = sum+remainder;
	num = quotient;
	
}

System.out.println(sum);
	}

}
