package Arrays;

public class Fan {
	String make;
	double radius;
	String color;
	boolean isOn;
	int speed; //1-5
	
	Fan(String make,double radius,String color)
	{
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	public String toString()
	{
		return String.format("make -%s, radius -%f , color -%s , isOn -%b ,speed -%d ", make,radius,color,isOn,speed);
	}

	public void switchOn() {
		this.isOn=true;
	}

	public void switchOff() {
		this.isOn=false;
		setSpeed(0);
		
	}

	public void setSpeed(int speed) {
		this.speed=speed;
		
	}

}
