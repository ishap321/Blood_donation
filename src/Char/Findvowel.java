package Char;

public class Findvowel {
	private char i;
	
	 Findvowel(char x)
	{
		 i=x;
	}
	 
	public  void isVowel()
	 {
		
		if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u' || i=='A' || i=='E' || i=='I' || i=='O' || i=='U')
		{
			System.out.println("it is a vowel");
		}
		else
			System.out.println("not a vowel");
	 }
	
	void isNo()
	{
		if(i>=48 && i<=58)
		{
			System.out.println("it is a no");
		}
		else
			System.out.println("not a number");
	}

	void isAlphabet()
	{
		if(i>='a' && i<='z' || i>='A' && i<='Z')
		{
			System.out.println("it is an Alphabet");
			
		}
		else
			System.out.println("not an alphabet");
	}
	
}
