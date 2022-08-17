
public class ListApp {

	public static void main(String[] args) {
		ArrayList<Square> squareList = new ArrayList<Square>(5);
		ArrayList<String> stringList = new ArrayList<String>(3);
		ArrayList<PointThreeD> pointThreeD = new ArrayList<PointThreeD>(5);
	
		squareList.addItem(new Square(3.1));
		squareList.addItem(new Square(4.2));
		squareList.addItem(new Square(1.4));
		squareList.addItem(new Square(6.7));
		squareList.addItem(new Square(5.8));
		
		stringList.addItem("Apple");
		stringList.addItem("Banana");
		stringList.addItem("Carrot");
		
		pointThreeD.addItem(new PointThreeD(2.1,3.3,1.1));
		pointThreeD.addItem(new PointThreeD(3.1,4.4,5.1));
		pointThreeD.addItem(new PointThreeD(1.5,3.3,4.6));
		pointThreeD.addItem(new PointThreeD(4.2,3.7,6.8));
		pointThreeD.addItem(new PointThreeD(2.1,3.5,6.7));
		
		System.out.println("List of Squares: ");
		for (int i =0;i<squareList.size();i++) {
			System.out.println(squareList.getItem(i));
			
		}
		System.out.println("\nList of Strings: ");
		for (int i = 0;i<stringList.size();i++) {
			System.out.println(stringList.getItem(i).toString());
		}
		System.out.println("\nList of points: ");
		for (int i=0;i<pointThreeD.size();i++) {
			System.out.println(pointThreeD.getItem(i).toString());
		}
	}//end main

}//end class
