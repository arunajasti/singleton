package interfaceTopic;
interface A1
{
	public void show();
	}
interface B1 
{
	public void display();
	}
interface C1 extends A1,B1//An interface EXTEND multiple 	interfaces//MULTIPLE iNHERITANCE IS POSSIBLE
{
	public void print();
	}
public class InterfaceExtend implements C1{
	
	public void show() {
		System.out.println("Welcome");
		}

	
	public void display() {
	System.out.println("TO");
		}

	
	public void print() {
		System.out.println("Everyone");
	}
	public static void main(String[] args) {
		C1 a=new InterfaceExtend();
		a.show();
		/*InterfaceExtend ex=new InterfaceExtend();
		ex.show();
		ex.display();
		ex.print();*/
		

	}

	

}
