package CS131Lab1_JBP;
import java.util.*;
public class BasketballTeam extends SportsTeam{

//instance variable - visibility is protected so subclasses can manipulate the data directly.
	
private int fieldGoals;
private int fieldGoalsAttempted;
private int freeThrows;
private int freeThrowsAttempted;

public BasketballTeam() {
	super();
	this.teamName="";
	this.teamMascot="";
	this.headCoach="";
	
	//end empty constructor
/**
 *  The preferred argument constructor generates the specifications for a basketballTeam
 */	
	
}//end empty-argument constructor

public BasketballTeam(int wins, int losses,String teamName,String teamMascot,String headCoach) {
	this.wins=wins;
	this.losses=losses;
	this.teamName=teamName;
	this.teamMascot=teamMascot;
	this.headCoach=headCoach;
}//end preferred constructor

public double fieldGoalPercentage() {
	return fieldGoals/fieldGoalsAttempted;
}//end fieldGoalPercentage

public double freeThrowPercentage() {
	return freeThrows/freeThrowsAttempted;

}//end freeThrowPercentage
public void setStats(int wins,int losses,int fieldGoals,int FieldGoalsAttempted,int freeThrows, int freThrowsAttempted) {
	this.fieldGoals=fieldGoals;
	this.fieldGoalsAttempted=fieldGoalsAttempted;
	this.freeThrows=freeThrows;
	this.freeThrowsAttempted=freeThrowsAttempted;
	
}//end setStats
public double[] getStats() {
	
	double arr[] = new double[3];
	arr[0]=getWinPercentage();
	arr[1]=fieldGoalPercentage();
	arr[2]=freeThrowPercentage();
	return arr;
}//end getStats

@Override
public String toString() {
	return "BasketballTeam [fieldGoals=" + fieldGoals + ", fieldGoalsAttempted=" + fieldGoalsAttempted + ", freeThrows="
			+ freeThrows + ", freeThrowsAttempted=" + freeThrowsAttempted + ", teamName=" + teamName + ", teamMascot="
			+ teamMascot + ", headCoach=" + headCoach + ", wins=" + wins + ", losses=" + losses + "]";
}


}//end class
