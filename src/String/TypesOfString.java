package String;

public class TypesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Length
		String str = "Hello, World!";
		int length = str.length();
		System.out.println("Length of the String: "+length);
		
		
		
		//String Concatenation
		String str1 = "Hello";
		String str2 = "World";
		
		String result = str1+" "+str2;
		
		System.out.println("Concatenated String: "+result);
		
		
		
		//String Comparison
		String s1 = "Hello";
		String s2 = "hello";
		if(s1.equals(s2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		// String Case-Insensitive String Comparison
		String str3 = "Hello";
		String str4 = "rishi";
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("String are Equal (Ignore Case)");
		}else {
			System.out.println("String are Not Equal (Ignore Case");
		}
		
		
		
		//String To Uppercase
		String c = "Rishikesh";
		String Uppercase = c.toUpperCase();
		System.out.println("Uppercase String: "+Uppercase);
		
		
		
		//String To Lowercase
		String r = "ROHIT";
		String lowercase = r.toLowerCase();
		System.out.println("Lowercase String: "+lowercase);
		
		
		
		//String Substring
		String g = "Hello, World!";
		String substr = g.substring(0, 5);
		System.out.println("Substring: "+substr);
		
		
		
		//String Character at Index
		String h = "Spring";
		char ch = h.charAt(4);
		System.out.println("Character at index 0: "+ ch);
		
		
		//String Replace
		String jk = "Lower Stage";
		String replacestr = jk.replace("o", "e");
		System.out.println("Replaced String: "+replacestr);
		
		
		
		//String Splliting
		String split = "apple,banana,orange";
		String[] fruits = split.split(",");
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

	}

}
