package OppsConcept;


class Animal{
	int a = 10;
	
	void eat() {
		System.out.println("Animal Eats Everything");
		
		System.out.println("---------------------------------------------------------------------------------------");
	}
}

class Deer extends Animal{
	void eat(){
		System.out.println("Deer Eats Only Grass");
		System.out.println(a);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		a.eat();
		
		Deer d = new Deer();
		d.eat();

	}

}
