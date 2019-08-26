package Oops;

//Base class
class Bicylce
{
	int gear;
	int speed;
	
	//Class constructor
	public Bicylce(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	
	//create a three class method
	
	public void applyBreak(int decreament)
	{
		speed -= decreament;
	}
	
	public void sppedUp(int increament)
	{
		speed += increament;
	}
	
	public String toString()
	{
	     return("No. of gears are: " +gear +"\n" + "Spped of Bicycle is: " +speed);	
	}
	
	
}

class MountainBike extends Bicylce
{
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int startHeight) 
	{
		super(gear, speed);
		seatHeight = startHeight;
		
		// TODO Auto-generated constructor stub
	}
	
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}
	
	public String toString()
	{
		return(super.toString() +"\n" +"nsetHeight is: " +seatHeight);
	}
	
}

public class Test_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mb = new MountainBike(2, 100, 25);
		System.out.println(mb.toString());

	}

}
