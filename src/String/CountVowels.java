package String;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Rishikesh";
		
		int vowel = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowel++;
			}
		}
		
		System.out.println("Number of Vowels: "+vowel);

	}

}
