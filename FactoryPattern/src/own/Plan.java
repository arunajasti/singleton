package own;

//this class eithe interface, abstarct or normal class
public abstract class Plan {
	protected double rate;
	abstract void getRate();

public void calculateBill(int units)
{
	System.out.println(units*rate);
}
}