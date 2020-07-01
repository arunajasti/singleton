package abstractANDinterface;

public class AbsimpintMain {

	public static void main(String[] args) 
	{
		Absimpint ab=new Absimpint();
		ab.a();
		ab.b();
		ab.c();
		ab.d();
		//Run-time polymorphism
		/*A ab=new Absimpint();//Interface reference refer to sub class 
		B  bb=new Absimpint();
		ab.a();
		ab.b();
		ab.c();
		bb.d();//but d is interface B*/

	}

}
