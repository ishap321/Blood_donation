package Abstract;

public class Recipe extends AbstractRecipe{
	
	void preparations() {
		System.out.println("do the preparations for the dish");
		System.out.println("collect raw ingredients");
	}
	
	void doTheDish()
	{
		System.out.println("do the recipe");
	}
	
	void cleaning()
	{
		System.out.println("do the cleanup");
	}

}
