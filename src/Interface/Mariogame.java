package Interface;

public class Mariogame implements Game_Console{

	@Override
	public void up() {
		System.out.println("jump");
		
	}

	@Override
	public void down() {
		System.out.println("down");
		
	}

	@Override
	public void left() {
		System.out.println("move backward");
		
	}

	@Override
	public void right() {
		System.out.println("move forward");
		
	}

}
