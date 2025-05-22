package OppsConcept;


abstract class father{
	abstract void disp();
}

class child extends father{
	void disp() {
		System.out.println("Child is Implemented");
	}
}

class son extends father{
	void disp() {
		System.out.println("Son is Implemented");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c = new child();
		c.disp();
		
		son s = new son();
		s.disp();

	}

}
