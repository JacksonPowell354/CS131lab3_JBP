package Lab1Project;

public class Building {

	public String projectName;
	public String completeAddress;
	public double totalSquareFeet;
	public String occupancyGroup;
	public String subGroup;
	
	public Building() {
		this.projectName="";
		this.completeAddress="";
		this.totalSquareFeet=0;
		this.occupancyGroup="";
		this.subGroup="";
		
	}//end empty-argument constructor
	
	public Building(String projectName,String completeAddress, double totalSquareFeet,String occupancyGroup,String subGroup) {
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subGroup=subGroup;
		}//end preferred constructor
	public void draw() {
		System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}//end draw
	public String displayData() {
		String str = "";
		str += "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet
		+ "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subGroup;
		return str;
	}//end displayData

	public String getProjectName() {
		return projectName;
	}//end getProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	public String getSubGroup() {
		return subGroup;
	}//end getSubGroup

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end setSubGroup

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}
	
	
}//end class
