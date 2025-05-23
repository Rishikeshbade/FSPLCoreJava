package Array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array: ");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Enter"+length+"elements: ");
		for(int i = 0; i < length; i++) {
			System.out.println("Element "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Array elements are: ");
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i]+" ");
		}
				}

}
