package Days;
import java.util.Scanner;
public class Days_weeks_months {
	 static void isWeekDay(int n)
	{
		if(n==1 || n==2 || n==3 || n==4 || n==5)
				System.out.println("it is a week day");
		else
			System.out.println("Weekend day!!");
	}
	 static void monthName(int m)
	 {
		 switch(m)
		 {		 
		 case 1:System.out.println("January");
		 		break;
		 case 2:System.out.println("February");
		 break;
		 case 3:System.out.println("March");
		 break;
		 case 4:System.out.println("April");
		 break;
		 case 5:System.out.println("May");
		 break;
		 case 6:System.out.println("June");
		 break;
		 case 7:System.out.println("July");
		 break;
		 case 8:System.out.println("August");
		 break;
		 case 9:System.out.println("September");
		 break;
		 case 10:System.out.println("October");
		 break;
		 case 11:System.out.println("November");
		 break;
		 case 12:System.out.println("December");
		 break;

		 }
	 }
	 static void dayName(int d)
	 {
		 switch(d)
		 {
	 case 0:System.out.println("sunday");
	 break;
	 case 1:System.out.println("monday");
	 break;
	 case 2:System.out.println("tuesday");
	 break;
	 case 3:System.out.println("wednesday");
	 break;
	 case 4:System.out.println("thursday");
	 break;
	 case 5:System.out.println("friday");
	 break;
	 case 6:System.out.println("saturday");
	 break;
		 }
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("Enter number from 0 to 6 to find whether it is a week day or not:  ");
		no = sc.nextInt();
		isWeekDay(no);
		int nm;
		System.out.println("Enter a number to find the respective month:");
		nm = sc.nextInt();
		monthName(nm);
		int dm;
		System.out.println("Enter a number to find the respective name of the day: ");
		dm = sc.nextInt(); 	 
		dayName(dm);
		 
		
		

	}

}
