/* WAP to create a class called "Airplane" with Flight number, destination, and departure time attributes and methods
to check flight status and delay. */
import java.time.LocalTime;

public class Airplane 
{
  String flightNumber;
  String destination;
  LocalTime Departure;
  int delayTime;

   Airplane(String flightNumber, String destination, LocalTime Departure) 
  {
    this.flightNumber = flightNumber;
    this.destination = destination;
    this.Departure = Departure;
    this.delayTime = 0;
  }

  String getFlightNumber() 
  {
    return flightNumber;
  }

   String setFlightNumber(String flightNumber) 
  {
    return this.flightNumber = flightNumber;
  }

   String getDestination() 
  {
    return destination;
  }

  String setDestination(String destination) 
  {
    return this.destination = destination;
  }

   LocalTime getDeparture() 
  {
    return Departure;
  }

  LocalTime setScheduledDeparture(LocalTime Departure) 
  {
    return this.Departure = Departure;
  }

   int getDelayTime() 
  {
    return delayTime;
  }

   void delay(int min) 
  {
    this.delayTime = min;
    this.Departure = this.Departure.plusMinutes(min);
  }

   void checkStatus() 
   {
    if (delayTime == 0) 
    {
      System.out.println(" Flight " + flightNumber + " is on time.");
    } else 
    {
      System.out.println(" Flight " + flightNumber + " is delayed by " + delayTime + " minutes.");
    }
   }
}
 class Test_Airplane 
{

	public static void main(String[] args) {
		Airplane flight1 = new Airplane("JE2345","Delhi",LocalTime.of(10,22)); 
		Airplane flight2 = new Airplane("DE9876","JAmmu",LocalTime.of(14,0)); 
		Airplane flight3 = new Airplane("PR54F","South Korea",LocalTime.of(13,22)); 
		System.out.println("\n Flight Status:"); 
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
		flight3.delay(13);
		flight1.delay(120);
		System.out.println("\n Current Flight Status:"); 
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
	}
}
