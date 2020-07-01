package javaINNERclasses;

public class InnerclassMain {

	public static void main(String[] args)
	{
		InnerclassPrivate nes=new InnerclassPrivate();
		//NestedclassPrivate.InnerPrivate inner=nes.new InnerPrivate(); thiswill not work because innerclassis private
		
		nes.display();
		nes.print();

	}

}
