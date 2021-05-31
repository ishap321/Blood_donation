package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayStudentRunner {

	

	public static void main(String[] args) {
		int []marks= {100,150,200};
		ArrayStudent a = new ArrayStudent("Isha",marks); 
		int no =a.getNoOfmarks();
		System.out.println("number of marks: "+no);
		int sum=a.getTotal();
		System.out.println("Total marks are: "+sum);
		int max=a.maxMark();
		System.out.println("Maximum marks are: "+max);
		int min=a.minMark();
		System.out.println("Minimum marks are: "+min);
		double avg=a.avgMarks();
		System.out.println("average marks are: "+avg);
		a.addMark(50);
		//System.out.println(Arrays.toString(a));
		a.removeMarkAtIndex(2);
		//System.out.println(Arrays.toString(a));
			

		
	}

}
