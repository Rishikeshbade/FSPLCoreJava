package Loops;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n; 
		int rev = 0;
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		n = sc.nextInt();
		
		int original =  n;
		
		while(n>0) {
			rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
		}
		if(original==rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println(" Number is Not Palindrome");

	}

}
