package SumUptoN;
import java.util.Scanner;

public class SumOfNums {

	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit for sum of numbers ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of numbers upto " +n+ " is " +sum);

	}

}
