package testcases;

public class PalindromeNumber17 {
	//A number when reversed remains the same number is a Palindrome Number
	//151, 454, 34543, 161, 78987
	
	
	public static void isPalindromeNumber(int num) {
		System.out.println("Given Number::"+num);
		
		int r = 0;//remainder no
		int sum = 0;
		int temp;
		
		temp = num;//temp take original given value
		
		while(num>0) {
			r = num%10;//get the remainder
			sum = (sum*10)+r;
			num = num/10;
		}
		if(temp==sum) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome number");
		}
		
	}
	
	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(152);
		isPalindromeNumber(78987);
		isPalindromeNumber(1110);
		isPalindromeNumber(0);//considered palindrome num since rev of 0 is 0

	}

}
