package Lab1Project;

public class SingleFamilyHome extends Residential {

	
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
public void draw() {
System.out.println("Drawing code for " + this.getClass().getSimpleName());
}//end draw
public String displayData() {
String str = "";
str += super.toString() + "\nGarage Available: " + ((garage == true) ? "Y" : "N");
return str;
}//end displayData

public boolean isGarage() {
	return garage;
}//end isGarage

public void setGarage(boolean garage) {
	this.garage = garage;
}//end setGarage


}//end class
