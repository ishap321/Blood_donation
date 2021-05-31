package shortest_path;

import java.util.Scanner;

public class shortest_path {

	public static void main(String[] args) {
		int dist1,dist2,dist3,min;
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the Distance from home to shop1");
		dist1= sc.nextInt();

		System.out.println("Enter the Distance from home to shop2");
		dist2=sc.nextInt();

		System.out.println("Enter the Distance between shops");
		dist3=sc.nextInt();

		int a=(2*(dist1+dist3));
		//System.out.println(a);
		int b=dist1+dist2+dist3;
		//System.out.println(b);


		min=(a<b) ? (a) : (b);
		System.out.println("The minimum distance travelled is " + min);
		sc.close();
		}	
	
}
