package Arrays;

public class Marks {

	public static void main(String[] args) {
		int [] marks = {75,60,56};
		int sum=0;
		for(int mark:marks)
		{
			sum=sum+mark;
		}
		System.out.println(sum);
		marks[1]=69;
		sum=0;
		for(int mark:marks)
		{
			sum=sum+mark;
		}
		System.out.println(sum);

	}

}
