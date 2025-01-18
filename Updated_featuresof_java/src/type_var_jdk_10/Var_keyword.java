package type_var_jdk_10;

public class Var_keyword {

	public static void main(String[] args) {
		
		var name = "hellow";  /*we can write using var keyword no need to use string*/
		name.concat(" this is concatination");
		System.out.println(name);
		
		var cars_price = 45258;
		System.out.println(cars_price);
		
		var double_price = 45.222654564658;
		System.out.println(double_price);
		
		var long_price = 789656832.265879561616;
		System.out.println(long_price);

		var int_price = 4;
		System.out.println(int_price);
		
		var float_price = 4.36363636;
		System.out.println(float_price);
		
	}

}
