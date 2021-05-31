package Exception;

import java.util.Scanner;

public class Exprunner {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
              scanner = new Scanner(System.in);		

	 
	 int[] num = {1,2,3,4};
	 
	 int nums = num[5];
	 
	
	 
	
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			 System.out.println("Before scanner close");
			 scanner.close();
		}
	 System.out.println("Before closing main");
	}
}
