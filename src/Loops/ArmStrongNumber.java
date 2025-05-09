package Loops;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, rev=0, rem, original, number, digits;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		n = sc.nextInt();
		number = n;
		original = number;
		
		digits = 0;
		
		while(original > 0) {
			original = original / 10;
			++digits;
		}
		
		original = number;
		
		
		while(original > 0) {
			rem = original % 10;
			result = result + Math.pow(rem, digits);
			original = original / 10;
		}
		if(number==result)
			System.out.println("The Number is Armstrong");
		else
			System.out.println("The Number is Not Armstrong");

	}

}
