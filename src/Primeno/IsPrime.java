package Primeno;
import java.util.Scanner;
public class IsPrime {
 static void isPrime(int no)
 {
	 int i,flag=0;
	 for(i=2;i<no/2;i++)
	 {
		 if(no%i==0)
		 {
			flag=1; 
		 }
		 
 	 }
	 if(no==1)
	 {
	 System.out.println(" a prime no");
	 }
	 if(flag==0)
	 {
		 System.out.println("a prime no");
	 }
 }
	 
	 
	public static void main(String[] args) {
		int n;
		IsPrime prime = new IsPrime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be searched as prime number or not");
		n=sc.nextInt();
		isPrime(n);
		

	}

}
