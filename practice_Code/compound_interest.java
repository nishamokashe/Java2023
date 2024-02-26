import java.util.Scanner;

class Compound_interest
{
   public static void main(String args[])
   {
    double investment , rate,fv;
    int year ,i;
    
    Scanner in = new Scanner(System.in);

    System.out.print("Input the investment amount: ");
    investment = in.nextDouble();

 	System.out.print("Input the rate of interest: ");
	rate = in.nextDouble();

	System.out.print("Input number of years: ");
	year = in.nextInt();

    System.out.println("Years    FutureValue");
    for( i = 1; i <= year; i++) 
    {
        fv=investment*Math.pow((1+rate/100),year); 
      System.out.println(+i+   "    " +fv);
    }
   }
}