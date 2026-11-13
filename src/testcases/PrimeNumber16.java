package testcases;

public class PrimeNumber16 {
	
	        // PrimeNum:Num divisible by itself and 1
			//2 is the lowest prime num
	
	public static boolean isPrimeNumber(int num) {
		//edge/corner cases:
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			
			if(num%2==0) {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));//t
		System.out.println(isPrimeNumber(6));//f
		System.out.println(isPrimeNumber(9));//t
		System.out.println(isPrimeNumber(10));//f
		System.out.println(isPrimeNumber(1));//f
		System.out.println(isPrimeNumber(0));//f
		System.out.println(isPrimeNumber(3));//t
		System.out.println(isPrimeNumber(17));//t
		System.out.println(isPrimeNumber(2));

	}

}
