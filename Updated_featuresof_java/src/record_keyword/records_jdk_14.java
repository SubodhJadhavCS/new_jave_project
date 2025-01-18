package record_keyword;

public class  records_jdk_14 {

	
	
	public static void main(String[] args) {
		
	   
		
		previoius_way previoius_way  = new previoius_way("bmw",522); /*traditional way of assigning final variables.*/
		
		System.out.println(previoius_way.getCar());
		System.out.println( previoius_way.getSpeed() );;
		
		Radio radio	= new Radio("mycity",98,"9 PM");  /*we created Record keyword class constructor*/
		
		System.out.println( radio.Frequency()); /*going to print our constant */
		System.out.println( radio.timing());
		System.out.println( radio.channel_name());
		
		
	}

}
