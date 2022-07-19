package Construction_JBP;

public class SingleFamilyHome extends Residential {

//instance variables - visibility is private so subclasses can manipulate the data only with super().

private boolean garage;

public SingleFamilyHome() {
	super();
	garage=false;
	
}//end empty-argument constructor
public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
		String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
		laundryRoom);
		this.garage = garage;	
}//end preferred constructor
/**
 *  draw method
 */
public void draw() {
System.out.println("Drawing code for " + this.getClass().getSimpleName());
}//end draw
/**
 *  toString method combines all the data 
 */
public String displayData() {
String str = "";
str += super.toString() + "\nGarage Available: " + ((garage == true) ? "Y" : "N");
return str;
}//end displayData
/**
 * Getters and Setters 
 */
public boolean isGarage() {
	return garage;
}//end isGarage

public void setGarage(boolean garage) {
	this.garage = garage;
}//end setGarage


}//end class
