package ExceptionHandling;

class InvalidException extends Exception{
	public InvalidException(String message) {
		super(message);
	}
}

public class CustomExceptionChecked {
	public static void checkAdmissionAge(int age) throws InvalidException{
		if(age < 17) {
			throw new InvalidException("Age must be 17 or Above for Admission");
		}else {
			System.out.println("Admisssion Allowed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			checkAdmissionAge(18);
		}catch(InvalidException e) {
			System.out.println("Message: "+e.getMessage());
		}

	}

}
