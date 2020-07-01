package javaINNERclasses;
abstract class Message
{
	abstract String greet();
}

public class AnonymousclassASargument
{
	//Ahis method is nonymousclassArgument
	public void displayMessage(Message mes)//Method which accepts the object of ABSTRACT/INTERFACE Message
	{
		System.out.println(mes.greet()+ " ,This is an example of Anonymous classas an argument ");
		}
	public static void main(String[] args)
	{
		AnonymousclassASargument arg=new AnonymousclassASargument();
	arg.displayMessage(new Message()                  //Mesage mes=new Message()
			{
		public String greet()
		{
			return " HELLO";
		}
			}
			);//arg.displaymessage
	}

}
