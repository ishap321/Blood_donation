package palindrome;
import java.util.Scanner;
import java.util.*;


public class Palindrom {
	
	public boolean Test(int n) {
		
		int temp;
		temp=n;
		int sum=0 ,rev=0;
		while(n>0) {
			                                                              
			rev= n%10;															
			sum=(sum*10)+rev;
			n=n/10;
		}
		if(sum==temp) {
			
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Palindrom p = new Palindrom();
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number");
		
		int n = sc.nextInt();	
		sc.close();
		int x=0,y=0,t1;
		
		while(!p.Test(n)) {
			t1=n;
			y=0;
			
			while(n>0) {
			x = n % 10;
		    y = (y*10) + x;
			n = n / 10;
			}
			n=t1+y;
			//if(p.Test(n))
				//break;
			
		}
		
		System.out.println("Palindrome="+n);

	}

}

