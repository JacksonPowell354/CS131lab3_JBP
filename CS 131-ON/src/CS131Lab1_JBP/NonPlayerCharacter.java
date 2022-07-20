package CS131Lab1_JBP;
import java.util.*;
import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private boolean active;
	private String intelligenceType;
	
	
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType


	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligneceType


	public NonPlayerCharacter(){
		super();
		this.active=false;
		this.intelligenceType="AVERAGE";
	}//end empty argument constructor

	public NonPlayerCharacter(String uniqueID,String personality,boolean active,String intelligenceType) {
		super();
		this.active=false;
		this.intelligenceType="AVERAGE";
	
	}//end preferred constructor
	
	

public String reportStructure(){
		
		StringBuilder sb = new StringBuilder();
				sb.append(super.reportStructure()).append("==================================\n");
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
		
	}//end reportStats

public String introduce() {
	return "Hello, my name is "+super.uniqueID;
}//end introduce

public String exclaim() {
	String [] Arr = {"Dag Gummit","Doggone it","Holy cow","Jeez","Well cheese and crackers"};
	Random r= new Random();
	int RandomPhrase=r.nextInt(Arr.length);
	return Arr[RandomPhrase];
}

}//end class
