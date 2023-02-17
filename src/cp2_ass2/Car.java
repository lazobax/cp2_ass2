package cp2_ass2;

public class Car extends Vehicle {
	
	private static int car_count = 0;
	private String car_type;
	private int seat_number;
	
	public Car(String bn, String dom, String col, String ct, int sn) {
		super(bn, dom, col); car_type = ct; seat_number = sn; car_count ++;
	}
	
	public String toString() {
		return super.toString() + " " + car_type + " " + seat_number + ": CAR";
	}
	
	public static int getCount() {
		return car_count;
	}
	
	public static void setCount(int num) {
		car_count = num;
	}

	public String getCarType() {
		return car_type;
	}

	public void setCarType(String ct) {
		car_type = ct;
	}

	public int getSeatNumber() {
		return seat_number;
	}

	public void setSeatNumber(int sn) {
		seat_number = sn;
	}
	
	
	
	
	

}
