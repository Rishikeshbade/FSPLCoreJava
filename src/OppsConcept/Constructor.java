package OppsConcept;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student obj = new student(25, "Ram");

	}

}

class student{
	student(int age, String name){
		System.out.println("Age "+age);
		System.out.println("Name: "+name);
	}
}

