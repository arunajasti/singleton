/*If we declare the class as Final we cannot EXTEND the class(Inheritance will not work)
 * */
package finalKeyword;
final class FinalClass
{
String carname;
int year=2006;

 public FinalClass(String carname) {
	this.carname = carname;
}

public  void model()
{
	System.out.println("Car model year: "+ carname+ " , " + year );
	}
public static void main(String args[])
{
	FinalClass c=new FinalClass("Honda Accord");
			c.model();
	
	}
}
//class carcompany extends car//The type carcompany cannot subclass the final class car
//{
	//}
