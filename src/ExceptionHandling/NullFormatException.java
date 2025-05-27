package ExceptionHandling;

public class NullFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Rishikesh";
		
		try {
			int n = Integer.parseInt(str);
		}catch(Exception e) {
			System.out.println("Null Format Exception Found!"+str);
		}

	}

}
