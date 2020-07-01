package vehicle;



abstract class Model
{
	final int wheels=4;
	final int doors=4;
	final int  speed=40;


	public void start()
	{
		System.out.println("Start the car..");
	}
	public  void stop()
	{
		System.out.println("Stop the car");
	}
	public void shift()
	{ 
		System.out.println("Change the Gear");
	}

	  
	abstract public void getspeed();

}
	
	

class Making extends Model
{
	String make;
	 String color;
	int  gears;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Making [make=" + make + ", color=" + color + "]";
	}

	public Making(String make, String color)
	{
		
		System.out.println("car model and color " +make+"   "+color);
	}

	@Override
	public void getspeed() 
	{
		System.out.println("get speed");
	}
	
}
public class Vehicle {

	public static void main(String[] args)
	{
		
		Making making=new Making("Honda","black");

                  making.setColor("white");
                  making.setMake("2006");
		making.getspeed();
		making.start();
		making.stop();
		making.shift();
		System.out.println(making);

	}

}
