package saeed;
import java.lang.*;

 interface Vehicle
{
	public double speed();
	public  int isRunning();
	
}
 
 class Land implements Vehicle
 {
	 double spd=100;
	 int running;
	 public double speed()
	 {
		 return spd;
	 }
	 public  int isRunning()
	 {
		 return running;
	 }
 }
 
 class Water implements Vehicle
 {
	 double spd;
	 int running;
	 public double speed()
	 {
		 return spd;
	 }
	 public  int isRunning()
	 {
		 return running;
	 }
 }
 
 class Air implements Vehicle
 {
	 double spd;
	 int running;
	 public double speed()
	 {
		 return spd;
	 }
	 public  int isRunning()
	 {
		 return running;
	 }
 }
 
 class Car extends Land
 {
	 int spd=50;
	 public double speed()
	 { 
		 return spd;}
	 public double superspeed()
	 {
		 return super.speed();
	 }
 }
 
 class Bus extends Land
 {
	 
 }
 
 class Ship extends Water
 {
	 
 }
 
 class Boat extends Water
 {
	 
 }
 
 class Plane extends Air
 {
	 
 }

 class Heli extends Air
 {
	 
 }
public class main {
	public static void  main(String[] args)
	{
		Land landV = new Land();
		Car audi =new Car();
		{
		
		
		try
		{
			//if(audi instanceof Land)
			 System.out.println("audi is instance of land");
		}
		catch (Exception e )
		{
			System.out.println("exception");
		}
			
		System.out.println("Car speed "+audi.speed());
		System.out.println("LAnd speed "+audi.superspeed());
	}
	}
}
