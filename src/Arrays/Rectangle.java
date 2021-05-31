package Arrays;

public class Rectangle {
	
	int l,b;
	Rectangle(int l, int b) 
	{
		this.l=l;
		this.b=b;
	}
	public int  area() {
				return (l*b);
	}
	public int perimeter() {
		return (2*(l+b));
		
	}

	public String toString()
	{
		return String.format("length =%d, breadth =  %d , area = %d  , perimeter = %d   ",l,b,area(),perimeter());
	}
	
	
}
