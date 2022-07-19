package Lab1Project;

public class Business extends Building{

	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits = 0;
	}//end empty constructor
	
	public Business(String projectName,String completeAddress, double totalSquareFeet,String occupancyGroup,String subGroup,int numRentableUnits) {
		super(projectName,completeAddress, totalSquareFeet, occupancyGroup,subGroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor

	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

		
	public String toString() {
		return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
		}//end toString
	
	
}//end class
