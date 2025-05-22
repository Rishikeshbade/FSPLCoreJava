package OppsConcept;

public class Employe {
	
	private int age;
	private String name;
	
	public Employe(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	private void display() {
		System.out.println("Age:"+age);
		System.out.println("Name: "+name);
	}
	
	public void show() {
		display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe obj = new Employe(24, "Rishi");
		obj.show();
	}

}
