package Lab1Project;

public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		this.numBathrooms=0;
		this.numBedrooms=0;
		this.laundryRoom = false;
	}//end empty-argument constructor
	
	public Residential(String projectName,String completeAddress, double totalSquareFeet,String occupancyGroup,String subGroup,int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName,completeAddress, totalSquareFeet, occupancyGroup,subGroup);		
		this.numBedrooms = numBedrooms;
		this.numBathrooms= numBedrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor

	public int getNumBedrooms() {
		return numBedrooms;
	}// end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	public void draw() {
		System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}//end draw
	public String toString() {
		return super.displayData() + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
		+ "\nLaundry Room: " + ((laundryRoom == true) ? "Y" : "N");
		}//end toString
	
}//end class
