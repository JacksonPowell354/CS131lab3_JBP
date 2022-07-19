package Lab1Project;

public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
public Apartment() {
	super();
	numRentableUnits = 0;
	avgUnitSize = 0.0;
	parkingAvailable = false;
	//hello my boi
}//end empty-argument constructor
	
public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
		String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
		double avgUnitSize, boolean parkingAvailable) {
	 
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
	laundryRoom);
	this.numRentableUnits=numRentableUnits;
	this.avgUnitSize = avgUnitSize;
	this.parkingAvailable=parkingAvailable;
}//end preferred constructor
public void draw() {
	System.out.println("Drawing code for ");
	}//end draw
	
public String displayData() {
String str = "";
str += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: "
+ avgUnitSize + "\nParking Available: " + ((parkingAvailable == true) ? "Y" : "N");
return str;
}//end displayData

}//end class

