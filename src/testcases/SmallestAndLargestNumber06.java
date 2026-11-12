package testcases;

import java.util.Arrays;

public class SmallestAndLargestNumber06 {

	public static void main(String[] args) {
		
		int numbers[] = {-10, 24, 50, 947656, 94657};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		
		System.out.println("\n given array is: "+Arrays.toString(numbers));
		System.out.println("largest number is: "+largest);
		System.out.println("smallest number is: "+smallest);

	}

}
