package Array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4};
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int rev = arr[start];
			arr[start] = arr[end];
			arr[end] = rev;
			
			start++;
			end--;
		}
		
		System.out.println("Reversed Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		//System.out.println("Reversed Array: ");
		//for(int i = arr.length -1; i >=0; i--) {
		///	System.out.print(arr[i]+ " ");
		//}

	}

}
