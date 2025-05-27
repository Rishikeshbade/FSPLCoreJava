package ExceptionHandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class EligibilityForVote {
	
	public static void checkEligiblityForVote(int age) throws InvalidAgeException{
		if(age > 18) {
			throw new InvalidAgeException("Age is Eligible!");
		}else {
			System.out.println("Age is not Eligible!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			checkEligiblityForVote(43);
		}catch(InvalidAgeException e) {
			System.out.println("Message: "+e.getMessage());
		}

	}

}
