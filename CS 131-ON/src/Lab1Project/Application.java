package Lab1Project;

public class Application {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Building b1 = new Building("Gaines House", "123 Main Street | Louisiville Kentucky 40201", 2540, "Residential",
			"R1");
			Business bsn1 = new Business("Culvers", "4630 South Hurstbourne | Lousiville Kentucky 40299", 2870, "Business", "B1",
			12);
			Apartment apt1 = new Apartment("Gaines Apartments", "121 Louis St | Louisiville Kentucky 40299", 12000,
			"Apartments", "A1", 40, 80, true, 36, 680, true);
			SingleFamilyHome sfh1 = new SingleFamilyHome("Gaines House",
			"123 Main Street| Louisiville Kentucky 40201", 2545, "SingleFamilyHouse", "SF1", 4, 3, true, true);

			System.out.println("********Building Details********\n" + b1.displayData()+"\n");

			System.out.println("********Business Building Details********\n" + bsn1.toString()+"\n");

			System.out.println("********Apartment Details********\n" + apt1.displayData()+"\n");
			

			System.out.println("********SingleFamilyHome Details********\n" + sfh1.displayData()+"\n");
		
			
		}
	}//end class


