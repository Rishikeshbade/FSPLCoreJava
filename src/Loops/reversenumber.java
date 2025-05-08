package Loops;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int reversed = 0;
		
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
			
		}
		System.out.println("Reversed Number:" +reversed);
	}

}
