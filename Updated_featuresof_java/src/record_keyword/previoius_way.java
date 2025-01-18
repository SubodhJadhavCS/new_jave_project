package record_keyword;

import java.util.Objects;

public class previoius_way {
	
	/*when record keyword was not present this was the way to make 
	 final variable with object 
	 checking and true string returning*/
	
	private  final String car;
	private  final int speed;
	
	public previoius_way(String car,int speed){
		this.car = car;
		this.speed = speed;
	}

	public String getCar() {
		return car;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(car, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		previoius_way other = (previoius_way) obj;
		return Objects.equals(car, other.car) && speed == other.speed;
	}

	
	@Override 
	public String toString() {
		return "previoius_way [car=" + car + ", speed=" + speed + "]";
	}
	
	
	
	
	

}
