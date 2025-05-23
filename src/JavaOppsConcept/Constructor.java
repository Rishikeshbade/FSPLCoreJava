package JavaOppsConcept;


public class Constructor {
	
	int age;
	String name;
	
	

	public Constructor(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("Age :"+age);
		System.out.println("Nmae: "+name);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor op = new Constructor(24, "Raj");

	}

}
