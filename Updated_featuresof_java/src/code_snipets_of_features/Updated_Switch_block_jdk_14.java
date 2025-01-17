package code_snipets_of_features;

public class Updated_Switch_block_jdk_14 {

	public static void main(String[] args) {

		/* traditional switch */
		best_manufacutere("BMW");
		/* modern switch */
		best_manufacutere_updated("porche");

	}

	private static void best_manufacutere(String cars) {
             
		switch(cars) {
		
		case "BMW": System.out.println("this is bMW");
		break;
			
		case "MERc": System.out.println("this is bMW");
		break;
		
		case "audi": System.out.println("this is bMW");
		break;
		
		default: System.out.println("ferrari is the best car");
		     }
		
	}

	private static void best_manufacutere_updated(String sportcars) {
		
		switch(sportcars) {
		
		case "BMW","audi","ferrari" -> System.out.println("ferrari is the best");
		
		case "porche","porcha","lexus" -> System.out.println("porche is the best");
		
		case "kia","hyundai","honda" -> System.out.println("kia is the best");
		
		default -> System.out.println("lambo is the best");
		
		}
		

	}
}
