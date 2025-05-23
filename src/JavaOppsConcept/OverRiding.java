package JavaOppsConcept;


class Animal{
	int a = 9;
	
	void display() {
		System.out.println("Animal Eats Anything!");
	}
}

class deer extends Animal{
	 
	void show() {
		System.out.println("deer eats only grass");
		System.out.println(a);
	}
}

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deer d = new deer();
		d.show();
		
		Animal a = new Animal();
		a.display();

	}

}
