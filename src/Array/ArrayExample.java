package Array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = 5;
		
		int arr[] = new int[size];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < size; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
		//System.out.println("arr.length");

	}

}
