package Array;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		 int length = sc.nextInt();
		 
		 int[] arr = new int[length];
		 
		 System.out.println("Enter " +length+ " integer values: ");
		 
		 
		 for(int i = 0; i < length; i++) {
			 System.out.println("Element of Array: "+ (i+1)+ ": ");
			 arr[i] = sc.nextInt();
		 }
		 
		 System.out.println("Array Elements are: ");
		 for(int i = 0; i < length; i++) {
			 System.out.println("Element at index "+i+": "+arr[i]);
		 }
		 
		 
	}

}
