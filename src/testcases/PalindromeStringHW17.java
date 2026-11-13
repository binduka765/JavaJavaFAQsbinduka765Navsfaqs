package testcases;

public class PalindromeStringHW17 {
		//teet

	    public static void isPalindromeString(String str) {
	        System.out.println("Given String::" + str);
	        //do not write while loop for string:will end in infinite loop
	        if (str == null) {
	            System.out.println("String is null");
	            return;
	        }

	        String reversed = new StringBuilder(str).reverse().toString();

	        if (str.equals(reversed)) {
	            System.out.println(str + " is a palindrome string");
	        } else {
	            System.out.println(str + " is not a palindrome string");
	        }
	    }

	    public static void main(String[] args) {
	        isPalindromeString("teet");
	        isPalindromeString("mom");
	        isPalindromeString("dad");
	        isPalindromeString("radar");
	        isPalindromeString("eye");
	        isPalindromeString("did");
	        isPalindromeString("civic");
	        isPalindromeString("rotor");
	        isPalindromeString("kayak");
	        isPalindromeString("level");
	        isPalindromeString("racecar");
	        isPalindromeString("reviver");
	        isPalindromeString("rotator");
	        isPalindromeString("repaper");
	        isPalindromeString("deified");
	        isPalindromeString("solos");
	        isPalindromeString("stats");
	        isPalindromeString("tenet");
	    }
}
	
