package com.bridgelabzDay3;

public class smallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{5,23,76,90,7,54};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] <min)  
			min=arr[i];

			
		}
		  System.out.println("Smallest element present in given array: " + min);  
	}

}
