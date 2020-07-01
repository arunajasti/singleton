package thread;
//if we put public before class its getting error(ask java instructor)
//because the main class already public that's why we dont give extends class as public
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Hello Thread1");
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Hello Thread2");
	}
}
public class ThreadDemo 
{
	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
                     t1.run();
        Thread2 t2=new Thread2();
                     t2.run();
                     
	}

}
