package testcases;

public class ReverseString01 {

	public static void main(String[] args) {
		//no reverse() in string fns in java - since string immutable
		//StringBuffer class has reverse() since SB not immutable
		
		//1.way using for loop:
		String s = "selenium";
		
		int len = s.length();
		System.out.println(len);
		String rev = "";
		
		
		for(int i=len-1;i>=0;i--) {
			//System.out.println(s.charAt(i));
			rev = rev + s.charAt(i);
			//System.out.println(rev);//do not print inside the loop
		}
		System.out.print(rev);
		System.out.println();
		
		//2.way using string buffer class:
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}
	
}
