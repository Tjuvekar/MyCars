
public class MyClass1 
{
	public static void main(String[] args)
	{
		MyCar MyCar = new MyCar();
		MyCar.location = 0;
		System.out.println("Initial values:");
		System.out.println("Current gear: " + MyCar.reportGear());
		System.out.println("Current location: " + MyCar.reportLocation());
		System.out.println("Remaining miles to destination: " + MyCar.reportRemaining());
		
		System.out.println("\nNow we make the car move for 6 hours. After this movement:");
		MyCar.moveByTime(6); // myCar moves for 2 hours!!!
		System.out.println("Current location: " + MyCar.reportLocation());
		System.out.println("Remaining miles to destination: " + MyCar.reportRemaining());
		
		System.out.println("\nNow we change the gear and make the car move for 2 hours. After this movement:");
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.moveByTime(2); // myCar moves for 2 hours!!!
		System.out.println("Current location: " + MyCar.reportLocation());
		System.out.println("Remaining miles to destination: " + MyCar.reportRemaining());
		
		System.out.println("\nNow we change the gear to reverse and make the car move for 3 hours. After this movement:");
		MyCar.reverseGear();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.moveByTime(3); // myCar moves back for 3 hour!!!
		System.out.println("Current location: " + MyCar.reportLocation());
		System.out.println("Remaining miles to destination: " + MyCar.reportRemaining());
		
		// here we check if the car has arrived to its destination
		System.out.println("Has myCar arrived? " + MyCar.isArrived());
		
		System.out.println("\nNow we change the gear many time to test if the error messages work properly:");
		MyCar.gearDown();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearUp();
		System.out.println("Current gear: " + MyCar.reportGear());
		MyCar.gearDown();
		System.out.println("Current gear: " + MyCar.reportGear());
		
		System.out.println("\nNow we make sure that he error messages for non-positive time works properly:");
		MyCar.moveByTime(-5);
		
	}
}

