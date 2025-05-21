package OppsConcept;

class Calculator{
	int a = 67;
	int b = 75;
	
	void sum() {
		System.out.println("Sum: "+(a+b));
	}
	
	void sum(float x, float y) {
		System.out.println("Sum: "+(x+y));
	}
	
	void sum(int x, float y) {
		System.out.println("Sum: "+(x+y));
	}
	
	void sum(double x, int y) {
		System.out.println("Sum: "+(x+y));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator ch = new Calculator();
		ch.sum();
		ch.sum(3.4f, 7.6f);
		ch.sum(3, 6.3f);
		ch.sum(67, 43f);

	}

}
