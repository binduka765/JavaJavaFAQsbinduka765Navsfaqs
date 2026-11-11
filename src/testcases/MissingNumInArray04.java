package testcases;

public class MissingNumInArray04 {
	//need to do BVA - chk for 1 and 10
	public static void main(String[] args) {
		
		//int a[] = {1,2,4,5,...100};
		//int a [] = {1,2,3,5}
		//add all nums of array=11	
		//add exact sequence=1+2+3+4+5=15
		//exact sequence sum - array sum = 15 - 11=4(missing num)
		
		int b [] = {1,2,3,4,5,6,7,8,10};
		int sum = 0;
		for(int i=1;i<b.length;i++) {
			sum = sum + b[i];
		}
		System.out.println(sum);//sum of all eles in array
		
		//sequential sum of ints 1 to 8:
		int sum1 = 0;
		for(int j=1;j<=10;j++) {
			sum1=sum1 + j;
		}
		System.out.println(sum1);
		int num = sum1 - sum;
		System.out.println(num);
		System.out.println("Missing Num of Array: "+num);
		
	}

}
