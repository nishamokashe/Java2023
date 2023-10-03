import java.util.Scanner;

public class Factorial1
{
    public static void main(String[] args)
    {
        Scanner F = new Scanner(System.in);
        int n, facto = 1; 
        
        System.out.print("Enter any positive integer: ");
        n = F.nextInt();
       
        for(int i=1; i<=n; i++)
        {
            facto=facto*i;
        }
        
        System.out.println("\n factorial of "+n+" is "+facto);
    }
} 
