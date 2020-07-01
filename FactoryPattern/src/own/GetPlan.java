package own;
//to genetare obj of concrete class based on goven info
public class GetPlan {

	public Plan getObject(String planType){
		if(planType==null){
		return null;
		}
		if(planType.equalsIgnoreCase("Domestic")) {
			return new Domestic();
		}
		else if(planType.equalsIgnoreCase("Commercial")) {
			return new Commercial();
		}
		return null;
		
	}
}
