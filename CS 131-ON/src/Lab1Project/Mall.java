package Lab1Project;

public class Mall extends Business {
private int numRentedUnits;
private double medianUnitSize;
private int numParkingSpaces;

public Mall() {
	super();
	this.numParkingSpaces = 0;
	this.numRentedUnits=0;
	this.medianUnitSize=0.0;
	
}//end empty-argument constructor

public Mall(String projectName,String completeAddress, double totalSquareFeet,String occupancyGroup,String subGroup,int numRentedUnits,double medianUnitSize, int numParkingSpaces) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numRentedUnits);
	this.medianUnitSize = medianUnitSize;
	this.numParkingSpaces = numParkingSpaces;
	
}//end preferred constructor
public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}//end draw

public String displayData() {
String str = "";
str += super.toString() + "\nNumber of Rented Units: " + numRentedUnits + "\nMedian Unit Size: "
+ medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces;
return str;
}//end displayData

public int getNumRentedUnits() {
	return numRentedUnits;
}//end getNumRentedUnits

public void setNumRentedUnits(int numRentedUnits) {
	this.numRentedUnits = numRentedUnits;
}//end setNumRentedUnits

public double getMedianUnitSize() {
	return medianUnitSize;
}//end getMedianUnitSize

public void setMedianUnitSize(double medianUnitSize) {
	this.medianUnitSize = medianUnitSize;
}//end setMedianUnitSize

public int getNumParkingSpaces() {
	return numParkingSpaces;
}//end getNumParkingSpaces

public void setNumParkingSpaces(int numParkingSpaces) {
	this.numParkingSpaces = numParkingSpaces;
}//end setNumParkingSpaces

}//end class
