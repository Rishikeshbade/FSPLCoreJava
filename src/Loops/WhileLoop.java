package Loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			if(i % 2 != 0) {
				System.out.println(i);
			}else {
				
			}
			i++;
		}
	}

}
