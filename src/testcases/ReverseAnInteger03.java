package testcases;

public class ReverseAnInteger03 {

	public static void main(String[] args) {
		//1: soln using proper algorithm
		long num = 12345; //54321
		
		long rev = 0;
		
		while(num !=0) {
			rev = rev * 10 + num % 10;//5
			num = num/10;//1234
		}
		System.out.println("Reverse num is::"+rev);
		
		//2:soln using String Buffer method,sb mutable and has reverse()
		long num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
