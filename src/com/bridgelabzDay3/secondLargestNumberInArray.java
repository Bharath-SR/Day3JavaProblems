package com.bridgelabzDay3;

public class secondLargestNumberInArray {
	public static int getMax22(int[] arr){
	    int max1 = arr[0];
	    int max2 = arr[1];
	    for (int i = 2; i < arr.length; i++){
	        if (arr[i] > max2)
	        {
	            max2 = arr[i];
	        }

	        if (max2 > max1)
	        {
	            int temp = max1;
	            max1 = max2;
	            max2 = temp;
	        }
	    }
	     return max2;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1 , 9 , 3, 2, 8, 34 ,54 ,66};
		
		 System.out.println("Second highest element in array is: " + getMax22(arr));

	}

}
