package JavaOppsConcept;


class father{
	int a = 50;
}


class duaghter extends father{
	int b = 70;
	int sum = a + b;
	
	
	void dispaly() {
		System.out.println("Sum of Two Number: "+sum);
	}
}
public class Inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duaghter d = new duaghter();
		d.dispaly();

	}

}
