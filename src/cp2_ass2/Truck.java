package cp2_ass2;

public class Truck extends Vehicle {
	
	private static int truck_count = 0;
	private int wheel_number;
	
	public Truck(String bn, String dom, String col,int wn) {
		super(bn, dom, col); wheel_number = wn; truck_count ++;
	}
	
	public String toString() {
		return super.toString() + " " + wheel_number + ": TRUCK";
	}
	
	public static int getTruckCount() {
		return truck_count;
	}


	public int getWheelNumber() {
		return wheel_number;
	}


	public void setWheelNumber(int wn) {
		wheel_number = wn;
	}
	
	
	

	

}
