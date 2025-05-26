package ExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Error: Divison by Zero is not Possible.");
		}

	}

}
