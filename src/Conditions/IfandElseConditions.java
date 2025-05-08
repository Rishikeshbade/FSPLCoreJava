package Conditions;

import java.util.Scanner;

public class IfandElseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number is Negative");
		}

	}

}
