package cp2_ass2;

public class Motorcycle extends Vehicle {
	
	private static int motorcycle_count = 0;
	private float engine_capacity;
	
	public Motorcycle(String bn, String dom, String col,float ec) {
		super(bn, dom, col); engine_capacity = ec; motorcycle_count ++;
	}

	public String toString() {
		return super.toString() + " " + engine_capacity + ": MOTORCYCLE";
	}
	
	public static int getCount() {
		return motorcycle_count;
	}
	
	public static void setCount(int num) {
		motorcycle_count = num;
	}

	public float getEngineCapacity() {
		return engine_capacity;
	}

	public void setEngineCapacity(float ec) {
		engine_capacity = ec;
	}
	
	

}
