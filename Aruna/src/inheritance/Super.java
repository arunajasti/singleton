package inheritance;
//Example of Child class refering Parent class property using super keyword
public class Super 
{
 private String name;//using getter & setter methods to access outside class 

public void show()
{
	
System.out.println("Super class");	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
