package interfaceMARKER;
//we  can define your own marker interfaces to indicate about any special behavior
interface cash  //user define marker interfaces
{   }
interface cheque
{    }

class one implements cash
{
	static void paymentBycash()
	{
		System.out.println("payments done by Cash");
	}
}
class two implements cheque
{
	static void paymnetBycheque()
	{
		System.out.println("Payments done by Cheque");
	}
}
public class UserDefinedMarkerInterface {


	public static void main(String[] args) {
		one.paymentBycash();
		two.paymnetBycheque();

	}

}
