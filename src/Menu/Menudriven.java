package Menu;
import java.util.Scanner;
public class Menudriven {
	
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		n1 = sc.nextInt();
		System.out.println("enter second number: ");
		n2 = sc.nextInt();
		
		System.out.println("1- Add\n 2- Sub\n 3- Mul\n 4- Div");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:int add;
				add=n1+n2;
				System.out.println("Addition of 2 numbers is: "+add);
				break;
				
		case 2: int sub;
				sub=n1-n2;
				System.out.println("Suntraction of 2 numbers is: "+sub);
				break;
				
		case 3: int mul;
				mul=n1*n2;
				System.out.println("Multiplication of 2 numbers is: "+mul);
				break;
				
		case 4: int div;
				div=n1/n2;
				System.out.println("Division of 2 numbers is: "+div);
				break;
				
		default: System.out.println("wrong choice!!");
		}
		}

}
