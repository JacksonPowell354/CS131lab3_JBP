package CS131Lab1_JBP;

public abstract class SportsTeam {
protected String teamName;
protected String teamMascot;
protected String headCoach;
protected int wins;
protected int losses;

public SportsTeam() {
	this.teamName="";
	this.teamMascot="";
	this.headCoach="";
	this.wins=0;
	this.losses=0;
	
}//end empty-argument constructor

public SportsTeam(String teamName,String teamMascot,String headCoach){
	this.teamName="";
	this.teamMascot="";
	this.headCoach="";
	this.wins=0;
	this.losses=0;
}//end preferred constructor

public double getWinPercentage() {
	return wins/(wins+losses);
}//end getWinPercentage

public void setStats() {
	
}

}//end class
