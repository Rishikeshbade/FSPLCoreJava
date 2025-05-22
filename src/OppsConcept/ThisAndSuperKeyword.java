package OppsConcept;


class parents{
	int a = 56;
}

class son1 extends parents{
	int a = 20;
	
	void display() {
		System.out.println("Using This Keyword: "+this.a);
		System.out.println("Using Super Keyword: "+super.a);
	}
}



public class ThisAndSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		son1 sb = new son1();
		sb.display();

	}

}
