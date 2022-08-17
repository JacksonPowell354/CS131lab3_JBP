
public class Square {
private double side;

public Square() {
	this.side=0.0;
}//end empty
public Square(double side) {
	this.side=side;
}// end preferred
public double getArea() {
	return side*side;
}
@Override
public String toString() {
	return "Square [side=" + side + ", area=" + getArea() + "]";
}//end getArea



}//end class
