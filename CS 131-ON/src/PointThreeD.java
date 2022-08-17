
public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {
		this.xPoint=0;
		this.yPoint=0;
		this.zPoint=0;
		
	}//end empty
	public PointThreeD(double xPoint, double yPoint,double zPoint) {
		this.xPoint=xPoint;
		this.yPoint=yPoint;
		this.zPoint=zPoint;

	}//end preferred
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	
	
}//end class
