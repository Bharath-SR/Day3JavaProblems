package com.bridgelabzDay3;

public class frequencyOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] numbers = new int [] {2, 1, 3, 4, 5, 5, 5, 3, 2, 4};
		    //This array will store the frequency of each element
		    int [] frequency = new int [numbers.length];
		    int counted = -1;
		    for(int i = 0; i < numbers.length; i++){
		      int count = 1;
		      for(int j = i+1; j < numbers.length; j++){
		        if(numbers[i] == numbers[j]){
		          count++;
		          //To avoid counting the frequency of same element again
		          frequency[j] = counted;
		        }
		      }
		      if(frequency[i] != counted)
		        frequency[i] = count;
		    }

		    //Printing the frequency of each element
		    for(int i = 0; i < frequency.length; i++){
		      if(frequency[i] != counted)
		        System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
		    }
		  }}