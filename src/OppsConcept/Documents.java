package OppsConcept;

interface Printable{
	int a = 100;
	void print();
}

interface Showable{
	int b = 56;
	void show();
	
}

interface Copy extends Printable, Showable{
	void copy();
}

public class Documents implements Printable, Showable {
	

	public static void main(String[] args) {
		
		Documents doc = new Documents();
		doc.print();
		doc.show();
		doc.copy();
		
	}

	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing Documents.....");
		
		
	}


	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing Documents.....");
		System.out.println(Printable.a);
		
	}
	
	public void copy() {
		System.out.println("Extended Version of Interface.....");
		System.out.println(Showable.b);
	}

}
