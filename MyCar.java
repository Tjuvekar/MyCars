import java.util.Scanner; 

public class MyCar //created class MyCar for following values
{		//assigned values to following variables, destination is constant
	int delta;
	int time;
	int location; 
	int gear = 1;
	int speed = 0;
	final int DESTINATION = 250;
	
	void reverseGear() //new method to change gear to -1, no return
	{ 
		gear = -1;
	}	
	void gearUp() //method to change gear up, unless already at 6
	{
		if (gear == -1) // gear has to change 1 if -1
		{
			gear = 1;
		}	
			else if (gear >= 6) //gear cannot go higher than 6
			{
				System.out.println("Gear cannot be increased.");
			}
			else //gear + 1 for the method gearUP
			{
				gear = gear +1;
			}
	}
	void gearDown() //method to change gear down unless already in reverse gear -1
	{
		if (gear == -1) //gear cannot go below reverse
		{
			System.out.println("Gear cannot be decreased, already in reverse.");
			if (gear == 1) //if driving in gear 1 cannot decrease gear value
			{
				System.out.println("Gear cannot be decreased anymore.");
			}
			else  //move gear down
			{
				gear = gear -1;
			}
		}
	}
	int reportGear() //method to call and return the gear
	{
		return gear;
	}
	int reportLocation() //method to call and return the location 
	{
		return location; 
	}
	int reportRemaining() //method to report remaining calculated and return integer value
	{
		int remaining = DESTINATION - location; //remaining calculation
		return remaining;
	}
	void moveByTime(int i)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); //get user input for the time value 
		time = input.nextInt();
		System.out.println("Please enter a positive value of time: ");
		
		if (time > 0) //if time > 0 then calculate following equations..
		{
			speed = gear * 20;
			delta = speed * time;
			location = location + delta;
		}
		else //else statement for telling user to enter a positive value
		{
			System.out.println("Error, time must be positive.");
		}
	}
	boolean isArrived() // create a boolean to make sure location >= DESTINATION
	{
		if (location >= DESTINATION)
		{
			return true; //it will return true if it agrees
		}
		else 
		{
			return false;// if not will return false 
		}
	}
}
















