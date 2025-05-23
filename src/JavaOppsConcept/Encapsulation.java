package JavaOppsConcept;

public class Encapsulation {
	
	private int age;
	private String name;
	
	

	public Encapsulation(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	private void Display() {
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
	}
	
	void show() {
		Display();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation en = new Encapsulation(23, "Rishi");
		en.show();

	}

}
