package JavaOppsConcept;



class Arithmetic{
	int a = 20;
	int b = 30;
	
	void sum() {
		System.out.println("Sum of TWo Number: "+(a+b));
	}
	
	void sub(float x, float y) {
		System.out.println("Subtraction of Two Number: "+(x-y));
	}
}


public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic art = new Arithmetic();
		art.sum();
		art.sub(82.3f, 56f);

	}

}
