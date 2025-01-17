package new_instance_pack;

public class New_instance_jdk14 {

	/*new instance of keyword in java introduced in JDK 14*/
	
	public static void main(String[] args) {
		
		
		My_instance_abstaction abstaction = new musicfile();
		use_instace_of((musicfile) abstaction);
	}
	
	

	private static void use_instace_of(musicfile abstaction) {
		
		if(abstaction instanceof musicfile) {     //checking it is it's instance or not.
		    
			((musicfile)abstaction).playmusic();	 //calling the method belongs to the class
			
			((musicfile)abstaction).my_personal_method(); // calling the personal method

		}
	}
}
