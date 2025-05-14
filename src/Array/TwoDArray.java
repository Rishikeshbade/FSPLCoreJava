package Array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows:");
		int rows = sc.nextInt();
		
		System.out.print("Enter Number of Columns: ");
		int cols = sc.nextInt();
		
		int arr[][] =  new int[rows][cols];
		
		
		
		System.out.println("Enter the elements of a array: ");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print("Element at [" +i+"]["+j+"]:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The array elements are: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
