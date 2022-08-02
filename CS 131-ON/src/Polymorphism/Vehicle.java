package Polymorphism;

public abstract class Vehicle {
	protected String id;
	protected int numPassengers;
	protected Location location;
	
	public Vehicle() {
		this.id="";
		this.numPassengers=0;
		this.location=new Location(0,0);
	}// 
	
	public Vehicle(String id, int numPassengers, Location location) {
		super();
		this.id=id;
		setNumPassengers(numPassengers);
		this.location=location;
		
	}//end preferred 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}//end class
