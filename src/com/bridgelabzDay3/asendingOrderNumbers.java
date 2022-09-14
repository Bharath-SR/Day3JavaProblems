/**
 * 
 */
package com.bridgelabzDay3;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class asendingOrderNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count, temp;
    	
    	//User inputs the array size
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in Array: ");
        count = input.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = input.nextInt();
        }
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);

	}

}
