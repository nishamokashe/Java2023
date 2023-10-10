//Write a Java program to find the number of days in a month.

public class Month 
{
   int month=8;
   void check()
   {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )//January, March, May, August, October, and December = 31 Days
		{
			System.out.println("\n 31 Days in this Month");  	
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 ) //April, June, September, and November = 30 Days
		{
			System.out.println("\n 30 Days in this Month");  	
		}  
		else if ( month == 2 ) //February = 28 or 29 Days
		{
			System.out.println("\n Either 28 or 29 Days in this Month");  	
		} 
		else
			System.out.println("\n Please enter Valid Number between 1 to 12");
	}
    public static void main(String[] args)
    {
      Month m = new Month();
      m.check();    
    }
}
