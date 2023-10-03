//Java nested if Program
import java.util.Scanner;
public class GreaterNu2
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if( num < 100 )
        { 
           System.out.println("The entered number is greater than 50 and less than 100"); 
           if(num > 50)
           {
	          System.out.println("The entered number is greater than 50 and lesser than 100");
	       }
	    }
	    else
	    {
	        System.out.println("The entered number is greater than 50 and lesser than 100");
	    }
     }
}