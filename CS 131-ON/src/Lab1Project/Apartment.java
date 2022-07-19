package Lab1Project;

public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	/*
	 * Empty constructor
	 */
public Apartment() {
	super();
	numRentableUnits = 0;
	avgUnitSize = 0.0;
	parkingAvailable = false;
	
}//end empty-argument constructor
	
/*
 * setting a preferred constructor to implement the instances from this class and parent class
 */
public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
		String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
		double avgUnitSize, boolean parkingAvailable) {
	 
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
	laundryRoom);
	this.numRentableUnits=numRentableUnits;
	this.avgUnitSize = avgUnitSize;
	this.parkingAvailable=parkingAvailable;
}//end preferred constructor
/*
 * setting a method to say "drawing code for"
 */
public void draw() {
	System.out.println("Drawing code for "+ this.getClass().getSimpleName());
	}//end draw
	
public String displayData() {
String str = "";
str += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: "
+ avgUnitSize + "\nParking Available: " + ((parkingAvailable == true) ? "Y" : "N");
return str;
}//end displayData

}//end class

