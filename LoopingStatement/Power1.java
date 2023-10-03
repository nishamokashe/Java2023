import java.util.Scanner;

public class Power1
{
    public static void main(String[] args)
    {
        Scanner p = new Scanner(System.in);
     
        int base,power, result=1;
        
        System.out.print("Enter the base number ");
        base = p.nextInt();
        
        System.out.print("Enter the power ");
        power = p.nextInt();

        for(int i = 1; i <= power; i++)
        {
	    result=result * base;
        }

        System.out.println("2 to the Power of 20 is equal to:-" +result);
    }
}
