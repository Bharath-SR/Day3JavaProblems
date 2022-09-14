package com.bridgelabzDay3;

public class largestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {25, 10, 11, 8 , 98};
		int max = arr[2];
		System.out.println("value of max:"+max);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("largest Number is:" +max);
	}

}
