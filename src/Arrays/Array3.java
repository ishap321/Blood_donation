package Arrays;
import java.util.*;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[15];
		int i, b=0;
		
		System.out.println("Enter the array elements : ");
		for(i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
			if(arr[i]>=(arr.length/2)) {
				b=arr[i];
			}
			
			else {
				System.out.println("Leader Element Doesn't Exists!!");
				break;
			}
		}
		sc.close();
		
			System.out.println(b);
	
	}
		

}
