package studentINFObyusingINHERITANCEbyusingGETTERSandSETTERS;

public class Person 
{
	private int id;
	private String name;
	
	public Person(int id, String name)
	{
	this.setId(id);
	this.setName(name);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	/*@Override
	public String toString() {
		return "Person [id=" + getId() + ", name=" + name + "]";
	}*/
		
}
