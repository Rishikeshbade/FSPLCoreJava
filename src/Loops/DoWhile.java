package Loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Enter a Number");
			n = sc.nextInt();
		}while(n != 2 && n !=3);
		
		System.out.println("Enter Zero to stop this program");

	}

}
