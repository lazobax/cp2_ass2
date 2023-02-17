package cp2_ass2;

public abstract class Vehicle {
	
	protected String brand_name;
	protected String date_of_make;
	protected String color;
	
	public Vehicle(String bn, String dom, String col){
		brand_name = bn; date_of_make = dom ; color = col;
	}
	
	public String toString() {
		return brand_name + " " + date_of_make + " " + color;
	}

	public String getBrandName() {
		return brand_name;
	}

	public void setBrandName(String bn) {
		brand_name = bn;
	}

	public String getDateOfMake() {
		return date_of_make;
	}

	public void setDateOfMake(String dom) {
		date_of_make = dom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;
	}
	
	

}
