//Author Name: Zachery Craft
//Date: 05/14/2021
//Program Name: Craft_Drone
//Purpose: Simulation using button, drone movement in x, y,z location


public class DroneClass {
	
	//Internal Variables
	
	public static int x = 0;
	public static int y = 0;
	public static int z = 0;
	
	
	//constructors
	
	DroneClass() {}
	
	//Required Methods
	
	//Move Forward
	
	public static void flyFront(DroneClass a){
		DroneClass.x = x+1;
		return;
	}
	
	//Move Backwards
	
	public static void flyBack(DroneClass a){
		DroneClass.x = x-1;
		return;
	}
	
	//Increase Altitude
	
	public static void flyUp(DroneClass a){
		DroneClass.y = y+1;
		return;
	}
	
	//Decrease Altitude
	
	public static void flyDown(DroneClass a){
		a.y = y-1;
	}
	
	//Turn Left
	
	public static void flyLeft(DroneClass a){
		a.y = z-1;
	}
	
	//Turn Right
	
	public static void flyRight(DroneClass a){
		a.y = z+1;
	}
	
	//Display Position
	
	public static void toString(DroneClass a){
		 System.out.println("Current Position: "
				+ "\nX Coodinate: " + a.x
				+ "\nY Coodinate: " + a.y
				+ "\nZ Coordinate: " + a.z);
		
	}
	
	
	
	
}
