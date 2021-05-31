package FitnessTest;

import java.util.Scanner;

public class Fitness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int i,k;
		System.out.println("Enter the trainees oxygen level:");
		for( i=0 ; i<9 ; i++) {
			 k =sc.nextInt();
			if(k >= 1 && k<=100) {
				arr[i]=k;
			}
			
			else {
				System.out.println("Invalid input.Enter a number between 1 to 100");
				i=i-1;
			}
		
		} 
	
		
		for(i=0;i<9;i++) {
		System.out.println(arr[i]);
		}
		
		int avg1, avg2, avg3;
		
		
		avg1=(arr[0]+arr[3]+arr[6])/3;
		
		avg2=(arr[1]+arr[4]+arr[7])/3;
		
		avg3=(arr[2]+arr[5]+arr[8])/3;
		
		
		System.out.println(avg1+ "&" + avg2+ "&" + avg3);
		
		if(avg1<70 && avg2<70 && avg3<70) {
			System.out.println("All trainees are unfit!!");
		}
		
		
		else if(avg1>=avg2 && avg1>=avg3) {
			
			System.out.println("Most fir trainee number : 1");
		}
		if(avg2>avg3) {
			System.out.println("Most fir trainee number : 2");
		}
		else {
			System.out.println("Most fir trainee number : 3");
		}
		
		
		
		if(avg1==avg2) {
			System.out.println("Most fir trainee number : 1 & 2");	
		}
		else if(avg1==avg3) {
			System.out.println("Most fir trainee number : 1 & 3");
		}
		
		else if(avg2==avg3) {
			System.out.println("Most fir trainee number : 2 & 3");
		}
		else {
		System.out.println("Most fir trainee number :1, 2 & 3");
		}
		
	}

}
