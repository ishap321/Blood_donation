package Abstract;

public abstract class AbstractRecipe {
	void execute() {
		preparations();
		doTheDish();
		cleaning();
	}
	
	abstract void preparations();
	abstract void doTheDish();
	abstract void cleaning();
	
}
