package Loops;

public class ReturnLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<10;i++) {
			if(i==3) {
				return;
			}
			System.out.println(" "+i);
		}

	}

}
