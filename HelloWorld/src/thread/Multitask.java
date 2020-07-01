package thread;
//Now here Multithreading is working
//multithreding means when we use Extends or Interface with START() Method 
class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("Hello Thread1");
	}
}

class Thread4 extends Thread
{
	public void run()
	{
		System.out.println("Hello Thread2");
	}
}
public class Multitask {

	public static void main(String[] args)
	{
		Thread3 t1=new Thread3();
        t1.start();//causes this thread to begin the execution
     Thread4 t2=new Thread4();
        t2.start();
	}

}
