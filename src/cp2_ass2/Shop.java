package cp2_ass2;

import java.util.ArrayList;

import java.util.Scanner;

public class Shop {
	
	public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	public String store_name;
	
	public Shop(String n) {
		store_name = n;
	}
	
	//asks for the type choice and returns 1, 2, 3, for car, truck, motorcycle
	public int typeChoice() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your vehicle Type?");
		System.out.println("1: Car    2: Truck    3: Motorcycle");
		
		int vehicle_type = input.nextInt();
		input.nextLine();
		

		return vehicle_type;
		
		
	}
	
	//displays all the vehicles of type 1, 2, 3 for car, truck, motorcycle
	public void displayType(int type) {
		
		int type_index = 0; //index of the occurrence of that vehicle type
		switch(type) {
		case 1:
			
			System.out.println("Cars: ");
			
			for(int i=0; i<vehicles.size(); i++) {
				if(vehicles.get(i) instanceof Car) {
					type_index ++;
					String vhc = type_index + ":    "+ vehicles.get(i).toString();
					System.out.println(vhc);
				}
			}
			System.out.println("There are:" + Car.getCount() + " Cars.");
			System.out.println("\n");
			
			
			break;

			
		case 2:
			
			System.out.println("Trucks");
			
			for(int i=0; i<vehicles.size(); i++) {
				if(vehicles.get(i) instanceof Truck) {
					type_index ++;
					String vhc = type_index  + ":    "+  vehicles.get(i).toString();
					System.out.println(vhc);
				}		
				
				
			}
			System.out.println("There are:" + Truck.getCount() + " Trucks.");

			System.out.println("\n");

			break;
			
		case 3:
			
			System.out.println("Motorcycles");
			
			for(int i=0; i<vehicles.size(); i++) {
				if(vehicles.get(i) instanceof Motorcycle) {
					type_index ++;
					String vhc = type_index  + ":    "+  vehicles.get(i).toString();
					System.out.println(vhc);
				}
			}
			System.out.println("There are:" + Motorcycle.getCount() + " Motorcycles.");

			System.out.println("\n");

			break;

		}
		
			}

	public void addVehicle() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("_________________");
		System.out.println("Add Vehicle");
		System.out.println("_________________");
		
		int vehicle_type = typeChoice();
		
		System.out.println("What is the Brand Name? ");
		String bn = input.nextLine();
		
		System.out.println("What is the Date of Make?");
		String dom = input.nextLine();
		
		System.out.println("What is the color?");
		String col = input.nextLine();
		
		//depending on type of vehicle do different things
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
		System.out.println("Delete Vehicle");
		System.out.println("_________________");
		
		
		int vehicle_type = typeChoice();
		
		int type_index = 0; //index of the occurrence of that vehicle type

		switch(vehicle_type) {
		case 1:
			
			displayType(1);
			
			System.out.println("Choose the Car you want to delete: ");
			int choice = input.nextInt();//Chooses the index of the specific vehicle type
			
			
			for(int i=0; i<vehicles.size();i++) {
				if(vehicles.get(i) instanceof Car) {
					type_index ++;//increase index for specific vehicle type
				}
				if(type_index == choice) { // if the index for specific type is the same as choice
					vehicles.remove(i);// remove that item from the ArrayList
					Car.setCount(Car.getCount()-1);
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
					Truck.setCount(Truck.getCount()-1);
					break;
				}
			}
			
			break;
			
			
		case 3:
			
			displayType(3);
			
			System.out.println("Choose the Motorcycle you want to delete: ");
			choice = input.nextInt();
			
			
			for(int i=0; i<vehicles.size();i++) {
				if(vehicles.get(i) instanceof Motorcycle) {
					type_index ++;
				}
				if(type_index == choice) {
					vehicles.remove(i);
					Motorcycle.setCount(Motorcycle.getCount()-1);
					break;
				}
			}
			
			break;
			
			
		default: 
			System.out.println("invalid type");
			
		}
		
		System.out.println("Vehicle deleted successfully!");
	}
	
	public void listAll() {
		
		int type_index = 1; //index of the occurrence of that vehicle type
	
			
		System.out.println("Cars: ");
		
		for(int i=0; i<vehicles.size(); i++) {
			String vhc = type_index + ":    "+ vehicles.get(i).toString();
			System.out.println(vhc);
			type_index ++;
		}
		
		System.out.println("\n");
		
		
		
	}
	
	public void printMenu() {
		System.out.println("\n1.Add a Vehicle");
        System.out.println("2.Delete a Vehicle");
        System.out.println("3.Display Type");
        System.out.println("4.List All");
        System.out.println("5.Exit");
        System.out.println("----------------------");
        System.out.print("Enter your choice: ");
	}
	
	public void menu() {
		
		Scanner input = new Scanner(System.in);
		int error = 0;
		boolean is_done = false;
		
		while(!is_done && error<5) {
			printMenu();
			int choice = input.nextInt();
			input.nextLine();
			
			switch(choice) {
			case 1:
				addVehicle();
				break;
			case 2:
				deleteVehicle();
				break;
			case 3:
				displayType(typeChoice());
				break;
			case 4:
				listAll();
				break;
			case 5:
				is_done = true;
				break;
			default:
				error++;
				if(error!=5) {
					System.out.println("Wrong input try again!");
				}
			}
			if(choice>1 && choice<5) {
				error = 0;
			}
		}
		
		if(error>=5) {
			System.out.println("5 invalid inputs in a row! Program terminated.");
		}else {System.out.println("Program ended by user");}
		
	}
	
	public static void main(String[] concs) {
		
		Shop s = new Shop("poop");
		s.menu();
		
		
	}

}
