package testcases;

public class ArmStrongNumber18 {
	/*
	 * every digit of Armstrong number when cubed and added, returns the same number
	 * e.g: 0, 1, 153, 370, 371, 407
	 */
	public static void isArmstrongNumber(int num) {
		System.out.println("given number::"+num);
		
		int cube=0;
		int r;
		int temp;
		
		temp = num;
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		if(temp==cube) {
			System.out.println("this is armstrong number");
		}
		else {
			System.out.println("this is not an armstrong number");
		}
	}
	public static void main(String[] args) {
		//isArmstrongNumber(153);
		//isArmstrongNumber(0);//BVA 
		//isArmstrongNumber(1);
		//isArmstrongNumber(370);
		//isArmstrongNumber(371);
		isArmstrongNumber(470);

	}

}
