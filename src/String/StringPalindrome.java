package String;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;



public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a String"); String input = sc.nextLine();
		 * 
		 * String normal = input.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
		 * 
		 * StringBuilder sb = new StringBuilder(normal); String rev =
		 * sb.reverse().toString();
		 * 
		 * if(normal.equals(rev)) { System.out.println("It is a Palindrome"); }else {
		 * System.out.println("It is not an Palindrome"); }
		 */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 String str = "nayan";
		 String rev1 = "";
		 
		 for(int i = str.length() - 1; i >= 0; i--) {
			 rev1 = rev1 + str.charAt(i);
		 }
		 if(str.equals(rev1)) {
			 System.out.println("It is a Plaindrome");
		 }else {
			 System.out.println("It is not an Palindrome");
		 }

	}

}
