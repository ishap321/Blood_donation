package Arrays;
import java.util.*;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
		int i ,c=0;
		
		System.out.println("Enter the array of 0's and 1's: ");
		for(i=0 ; i<arr.length-1 ; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0) {
				c++;          //how many times 0 occurs that many times the count value increases
			}
		}
		
		for(i=0 ; i<c ; i++) {
			//we will fill 0's at the start of array(i=0) till the count no.			
			arr[i]=0;         
			
		}
		for(i=c ; i<arr.length-1 ; i++) {
			//from count onwards(after we fill 0's till the count)we will start filling the remaining 1's
			arr[i]=1;
		}
		

		for(i=0 ; i<arr.length-1 ; i++) {
			
			System.out.println(arr[i]);
		}
	}

}
