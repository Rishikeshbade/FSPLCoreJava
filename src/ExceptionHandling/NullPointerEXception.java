package ExceptionHandling;

public class NullPointerEXception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		
		try {
			System.out.println(str.length());
		}catch(Exception e) {
			 System.out.println("Handle Null Pointer Exception!");
		}

	}

}
