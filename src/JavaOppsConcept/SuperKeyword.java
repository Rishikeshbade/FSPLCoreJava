package JavaOppsConcept;

class parent{
	int a = 10;
}

class son extends parent{
	int a = 20;
	
	void display() {
		System.out.println("This:"+this.a);
		System.out.println("super:"+super.a);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son sc = new son();
		sc.display();

	}

}
