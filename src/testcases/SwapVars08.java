package testcases;

public class SwapVars08 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		//1.with using third var: t
//		int t;
//		t = x; //5
//		x = y; //10
//		y = t; //5
//		
//		System.out.println(x);//10
//		System.out.println(y);//5
		
		//2. without using third var: using + operator
//		x = x + y;//5+10=15
//		y = x - y;//5=15-10=5 - 0101
//		x = x - y;//15-5=10 - 1010
//				
//		System.out.println(x);//10
//		System.out.println(y);//5
		
		//3.without using third var: using * operator
//		x = x * y;//50
//		y = x/y;//50/10=5
//		x = x/y; //50/5=10
//		
//		System.out.println(x);//10
//		System.out.println(y);//5
		
		//4. using XOR:bitwise conversion ^ -0101 format
		x = x ^ y;//15 -> 1111
		y = x ^ y; //10 -> 1010
		x = x ^ y;//5 -> 0101
		
		System.out.println(x);//10
		System.out.println(y);//5
		
		
		
	}

}
