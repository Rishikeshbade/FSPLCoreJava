package ExceptionHandling;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1, 2, 3, 4, 5};
		
		try {
			System.out.println("Accessing 10th element: "+arr[9]);
		}catch(Exception e ) {
			System.out.println("Array index out of bound!");
		}

	}

}
