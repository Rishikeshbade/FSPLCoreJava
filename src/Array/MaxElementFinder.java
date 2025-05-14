package Array;

public class MaxElementFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 7, 8};
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum Element in array: "+max);

	}

}
