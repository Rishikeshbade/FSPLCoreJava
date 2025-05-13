package Array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		
		int legnth = 4; 
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Print sum of array elements: "+sum);
		

	}

}
