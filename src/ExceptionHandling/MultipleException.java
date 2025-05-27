package ExceptionHandling;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7;
		int b = 0;
		
		int arr [] = {2, 4, 6 ,7};
		
		try {
			System.out.println("Divide: "+(a/b));
			
			System.out.println("Print 7th Element: "+arr[6]);
			
		}catch(Exception e) {
			 System.out.println("Arithmetic Exception Found!");
			 
			 System.out.println("ArrayIndexOut of Bound Found!");
		}

	}

}
