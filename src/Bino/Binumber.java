package Bino;

public class Binumber {
	int a,b;
	Binumber(int x, int y)
	{
		a=x;
		b=y;
	}
	
	void add()
	{
		System.out.println("addition of two nubers is  "+(a+b));
		
	}
	
	void multiply()
	{
		System.out.println("multiplication of two nubers is  "+(a*b));
	}
	
	void doublee()
	{
		a+=a;
		b+=b;
		System.out.println(a);
		System.out.println(b);
	}

}
