package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStudent {
	private  ArrayList<Integer> marks = new ArrayList<Integer>();
	private String name;

	ArrayStudent(String name , int []marks)
	{
		this.name=name;
		for(int mark:marks)
		{
			this.marks.add(mark);
		}
	}
	int getNoOfmarks()
	{
		return marks.size();
	}
	int getTotal()
	{
		int sum=0;
		for(int mark:marks)
		{
			sum=sum + mark;
		}
		return sum;
	}
	public int maxMark() {
		int max=0;
		for(int mark:marks)
		{
			if(mark>max)
				max=mark;
		}
		return max;
	}
	public int minMark() {
		int min=Integer.MAX_VALUE;
		for(int mark:marks)
		{
			if(mark<min)
				min=mark;
		}
		return min;
	}
	public double avgMarks() {
		int sum=getTotal();
		int num=getNoOfmarks();
		return (sum/num);
	}
	public void addMark(int i) {
		
	   marks.add(i);
	}
	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}
}
