package Arrays;

public class FanRunner {

	public static void main(String[] args) {
	Fan fan = new Fan("Manufacturer 1",1.5,"BLACK");
	
	fan.switchOn();
	fan.setSpeed(5);
	System.out.println(fan);
	fan.switchOff();
	System.out.println(fan);
	}

}
