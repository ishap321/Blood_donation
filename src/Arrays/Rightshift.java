package Arrays;

import java.util.Scanner;

public class Rightshift {

	public static void main(String[] args) {

		int i , j;
		int[] arr = new int[8];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		
		for(i=0 ; i<arr.length ; i++) {
			arr[i]=sc.nextInt();
		}
		  
		System.out.println("Enter position : ");
		int p = sc.nextInt();
		for(i=0 ; i<p ; i++) {
			int b;
			b=arr[arr.length-1];
			
			for(j=arr.length-1 ; j>0 ; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=b;
		}
		

		for(i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}

	}

}
