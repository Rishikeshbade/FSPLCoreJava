package ExceptionHandling;

public class NullPointerUsingThrow {

	public static void main(String[] args) {

		String str = null;

		try {
			if (str == null) {
				throw new NullPointerException("String is Null!");
			}
		} catch (Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}

