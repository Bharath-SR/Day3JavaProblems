package com.bridgelabzDay3;

public class duplicateNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        int[] array = {1, 1, 2 , 2, 5, 5, 6, 6, 7, 2};
		 
		        for (int i = 0; i < array.length-1; i++)
		        {
		            for (int j = i+1; j < array.length; j++)
		            {
		                if ((array[i] == array[j]) && (i != j))
		                {
		                    System.out.println("Duplicate Element : "+array[j]);
		                }
		            }
		        }
		    }    

	}

}
