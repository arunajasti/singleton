package carprogram;


abstract class Car
{
	public void wheels()
	{

		System.out.println("Car has a 4 Wheels");
	}


	public abstract void getmaximumspeed(int currentSpeed);
}


class Engine 
{

	public  Engine(String mode)
	{
		String gearmode="start";
		if( gearmode==mode)
		{
			System.out.println("Start the engine");
		}
		else
		{
			System.out.println("Stop the engine");
		}
	}

}
class Shift extends Engine
{

	String gear;
	public Shift(String  gearposition, String mode)
	{
		super(mode);
		gear=gearposition;
		System.out.println("GearPosition:"+gear);
	}

}

class Model extends Car
{
	private String make;
	private String color;
	private int doors;
	public Model(String make,String color,int doors)
	{
		this.make=make;
		this.color=color;
		this.setDoors(doors);
	}

	public String getMake() {	return make;}
	public void setMake(String make){	this.make = make;}

	public String getColor(){	return color;}
	public void setColor(String color){	this.color = color;}

	public int getDoors() {return doors;}
	public void setDoors(int doors) {this.doors = doors;}


	public  void getmaximumspeed(int  currentSpeed)
	{
		int  speedLimit = 80;
		if (currentSpeed > speedLimit)
		{
			System.out.println("Slow down!  You're over the limit by " + (currentSpeed - speedLimit));
		}
		else
		{
			System.out.println("Go faster, you're only going " + currentSpeed);
		}
	}

	@Override
	public String toString() {
		return "Model [make=" + make + ", color=" + color + ", doors=" + doors + "]";
	}


}
public class Vehicle1 
{

	public static void main(String[] args) 
	{

		Car c=new Model("Honda","white",4);
		Shift shift=new Shift("Drivemode","start");


		c.getmaximumspeed(100);
		c.wheels();
		System.out.println(c);
	}
}
