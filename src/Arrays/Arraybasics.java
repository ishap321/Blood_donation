package Arrays;
import java.util.Arrays;

public class Arraybasics {

	public static void main(String[] args) {
		int []marks= {1,2,3,4,5,6,7,8};
		//marks.length;
		System.out.println(Arrays.toString(marks));
		Arrays.fill(marks,10);
		System.out.println(Arrays.toString(marks));
		int []marks2= {10,10,10,10,10,10,10,10};
		System.out.println(Arrays.equals(marks, marks2));
		//int []marks3= {1,2,3,4};
		//System.out.println();
		
	}

}
