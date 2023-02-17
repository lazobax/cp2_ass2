package cp2_ass2;

import java.util.ArrayList;

import java.util.Scanner;

public class Shop {
	
	public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	public String store_name;
	
	public Shop(String n) {
		store_name = n;
	}
	
	public void displayType(int type) {
		
		int type_index = 1; // index of the specific type
		switch(type) {
		case 1:
			
			for(int i=0; i<vehicles.size(); i++) {
				if(vehicles.get(i) instanceof Car) {
					String vhc = type_index + ":    "+ vehicles.get(i).toString();
					System.out.println(vhc);
					type_index ++;
				}
			}
			System.out.println("\n");
			
			break;

			
		case 2:
			
			for(int i=0; i<vehicles.size(); i++) {
				if(vehicles.get(i) instanceof Truck) {
					String vhc = type_index  + ":    "+  vehicles.get(i).toString();
					System.out.println(vhc);
					type_index ++;
				}		
				
				
			}
			System.out.println("\n");

			break;
			
		case 3:
			
			for(int i=0; i<vehicles.size(); i++) {
				if(vehicles.get(i) instanceof Motorcycle) {
					String vhc = type_index  + ":    "+  vehicles.get(i).toString();
					System.out.println(vhc);
					type_index ++;
				}
				
				
			}
			System.out.println("\n");

			break;

		}
		
			}

	public void addVehicle() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("_________________");
		System.out.println("Add Vehicle");
		System.out.println("_________________");
		
		System.out.println("What is your vehicle Type?");
		System.out.println("1: Car    2: Truck    3: Motorcycle");
		
		int vehicle_type = input.nextInt();
		input.nextLine();
		
		System.out.println("What is the Brand Name? ");
		String bn = input.nextLine();
		
		System.out.println("What is the Date of Make?");
		String dom = input.nextLine();
		
		System.out.println("What is the color?");
		String col = input.nextLine();
		
		switch(vehicle_type) {
		
		case 1:
			
			System.out.println("What is the Seat Number?");
			int sn = input.nextInt();
			
			String[] car_types = {"", "Sedan", "SUV", "Hatchback"};
			System.out.println("What is the car type?");
			System.out.println("1: Sedan    2: SUV    3: Hatchback");
			int car_type = input.nextInt();
			
			Car c = new Car(bn, dom, col, car_types[car_type], sn);
			
			vehicles.add(c);
			
			break;
		
		case 2:
			
			System.out.println("What is the Wheel Number?");
			int wn = input.nextInt();
			
			Truck t = new Truck(bn, dom, col, wn);
			
			vehicles.add(t);
			
			break;
		
		case 3:
			
			System.out.println("What is the engine capacity?");
			float ec = input.nextFloat();
			
			Motorcycle m = new Motorcycle(bn, dom, col, ec);
			
			vehicles.add(m);
			
			break;
		default:
			System.out.println("You chose an unavailable vehicle type!");
		}
		
		System.out.println("Vehicle added successfully!");
	
		
	}
	
	public void deleteVehicle() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("_________________");
		System.out.println("Add Vehicle");
		System.out.println("_________________");
		
		System.out.println("What is your vehicle Type?");
		System.out.println("1: Car    2: Truck    3: Motorcycle");
		
		int vehicle_type = input.nextInt();
		input.nextLine();
		
		int type_index = 0;

		switch(vehicle_type) {
		case 1:
			
			displayType(1);
			
			System.out.println("Choose the Car you want to delete: ");
			int choice = input.nextInt();
			
			
			for(int i=0; i<vehicles.size();i++) {
				if(vehicles.get(i) instanceof Car) {
					type_index ++;
				}
				if(type_index == choice) {
					vehicles.remove(i);
					break;
				}
			}
			
			break;
			
		case 2:
			
			
			displayType(2);
			
			System.out.println("Choose the Truck you want to delete: ");
			choice = input.nextInt();
			
			
			for(int i=0; i<vehicles.size();i++) {
				if(vehicles.get(i) instanceof Truck) {
					type_index ++;
				}
				if(type_index == choice) {
					vehicles.remove(i);
					break;
				}
			}
			
			break;
			
			
		case 3:
			
			displayType(1);
			
			System.out.println("Choose the Car you want to delete: ");
			choice = input.nextInt();
			
			
			for(int i=0; i<vehicles.size();i++) {
				if(vehicles.get(i) instanceof Car) {
					type_index ++;
				}
				if(type_index == choice) {
					vehicles.remove(i);
					break;
				}
			}
			
			break;
			
			
		default: 
			System.out.println("invalid type");
			
		}
	}
	
	public void displayType() {
		
	}
	
	public void listAll() {
		
	}
	
	public void menu() {
		
	}
	
	public static void main(String[] concs) {
		
		Shop s = new Shop("poop");
		
		for(int i = 0; i<6 ; i++ ) {
			s.addVehicle(); 
		}
		
		s.displayType(1);
		s.displayType(2);
		s.displayType(3);
		
		s.deleteVehicle();
		s.deleteVehicle();
		s.deleteVehicle();
		
		s.displayType(1);
		s.displayType(2);
		s.displayType(3);
		
		
	}

}
