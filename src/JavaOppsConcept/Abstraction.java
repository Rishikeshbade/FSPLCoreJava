package JavaOppsConcept;

abstract class father1{
	abstract void display();
}

 class children extends father1{
	void display() {
		System.out.println("This this a Children");
	}
}
 
 class sons extends father1{
	 void display() {
		 System.out.println("This is a son!");
	 }
 }
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		children ch = new children();
		ch.display();
		
		sons s = new sons();
		s.display();

	}

}
