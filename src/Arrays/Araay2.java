package Arrays;
import java.util.*;

public class Araay2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
		int[] arr0 = new int[9];
		int[] arr1 = new int[9];
		int[] arr2 = new int[9];
		int i ;
	 
		System.out.println("Enter the array elements in 0's, 1's & 2's: ");
		for(i=0 ; i<arr.length-1 ; i++) {
			arr[i]=sc.nextInt();
		//	System.out.println(Arrays.deepToString(arr[i]));
			if(arr[i]==0) {
				arr0[i]=arr[i];
			}
			else if(arr[i]==1) {
				arr1[i]=arr[i];
			}
			else if(arr[i]==2) {
				arr2[i]=arr[i];
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr0[i] + arr1[i] + arr2[i]);
		}

//		for(i=0 ; i<z ; i++) {
//			arr[i]=0;
//		}
//		
//		for(i=arr.length-1 ; i<z ; i--) {
//			arr[i]=1;
//		}
//		for(i=z ; i<arr.length-1; i++) {
//			arr[i]=2;
//		}
//		
		for(i=0; i<arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}

}
