import java.util.Scanner;

//Author Name: Zachery Craft
//Date: 05/14/2021
//Program Name: Craft_Drone
//Purpose: Simulation using button, drone movement in x, y,z location


public class StartHere extends DroneClass {

	public static void main(String[] args) {
		
		//Start Program
		
		DroneClass testDrone = new DroneClass();
		
		int choice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//Begin loop
		while (choice != 8) {
			System.out.println("Which direction would you like to move the drone?"
					+ "\n1 - Move Up"
					+ "\n2 - Move Down"
					+ "\n3 - Move Forward"
					+ "\n4 - Move Backward"
					+ "\n5 - Turn Left"
					+ "\n6 - Turn Right"
					+ "\n7 - Display Position"
					+ "\n8 - Exit Navigation"
					);
			
			int choice2 = scan.nextInt();
		
		choice = choice2;
		
		if(choice == 1){
			
			flyUp(testDrone);
			System.out.println("You have moved up!");
		}
		
		if(choice == 2){
			
			System.out.println("You have moved down!");
		}
		
		if(choice == 3){
			
			System.out.println("You have moved forward!");
		}
		
		if(choice == 4){
			
			System.out.println("You have moved backward!");
		}
		
		if(choice == 5){
			
			System.out.println("You have turned left!");
		}
		
		if(choice == 6){
			
			System.out.println("You have turned right!");
		}
		
		if(choice == 7){
			
			System.out.println("Displaying position...");
			
			toString(testDrone);
		}
		
		if(choice == 8) {
			
			System.out.println("Thank you for flying today. Goodbye!");
		}
		
		
		
			
		}

	}	

}
