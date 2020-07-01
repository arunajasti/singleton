
public class StudentAddress
{
	String streetname;
	String city;
	String state;
	int zipcode;
	

	public StudentAddress(String streetname, String city, String state, int zipcode)
	{
		//super();
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "StudentAddress [streetname=" + streetname + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}

}
