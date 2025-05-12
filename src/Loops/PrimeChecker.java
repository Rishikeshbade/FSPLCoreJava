package Loops;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int n = sc.nextInt();
		
		boolean isprime = true;
		
		if(n <= 1) {
			isprime = false;
		}else {
			for(int i = 2; i < n; i++) {
				if(n % i == 2) {
					isprime = false;
					break;
				}
			}
		}
		
		if(isprime) {
			System.out.println("It is a Prime Number");
		}else {
			System.out.println("It is not a Prime Number");
		}

	}

}
