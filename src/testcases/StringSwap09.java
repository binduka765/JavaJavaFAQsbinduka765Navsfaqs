package testcases;

public class StringSwap09 {

	public static void main(String[] args) {
		//SWAP: to swap without using temp/third variable:
		
		String a = "hello";
		String b = "world";
		
		System.out.println("before swapping:");
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		
		//1.append a and b:
		a = a+b;//helloworld
		
		//2.store initial string a in string b:
		b = a.substring(0, a.length()-b.length());
		
		//3.store initial string b in string a:
		a = a.substring(b.length());
			
		System.out.println("values after swapping:");
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);

	}

}
