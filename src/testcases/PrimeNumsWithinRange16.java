package testcases;

public class PrimeNumsWithinRange16 {
	// range given = 2 to 20
	
	public static boolean isPrimeNumber(int num) {
		//edge/corner cases:
		if(num<=1) {
		return false;
		}
		for(int i=2;i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	//range:20 =>2 to 20 since lowest prime is 2
	public static void getPrimeNumbersWithinRange(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		getPrimeNumbersWithinRange(20);

	}

}
