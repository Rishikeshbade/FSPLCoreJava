package Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter a Number: ");
		 
		 int n = sc.nextInt();
		 
		 for(int i = 1; i <= n; i++) {
			 if(i % 2 != 0) {
				 System.out.println(i);
			 }else {
				 
			 }
		 }
		 
	}

}
