package OppsConcept;

class Parent{
	String car = "Mustang";
	int money = 3000;
}

class child1 extends Parent{
	String bike = "BMW";
	int cmoney = 67889;
	
	
	 void display() { System.out.println("Car: "+car);
	 System.out.println("Parent Money: "+money);
	 System.out.println("Bike: "+bike);
	 System.out.println("Total Money: "+(money+cmoney)); }
	
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 obj = new child1();
		obj.display();
		System.out.println("Car: "+obj.car);
		System.out.println("Parent Money: "+obj.money);
		System.out.println("Bike: "+obj.bike);
		System.out.println("Total Money: "+(obj.money+obj.cmoney));

	}

}
