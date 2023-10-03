/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table 
of that number. */
import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n;
        
        System.out.print("Enter any positive integer: ");
        n = c.nextInt();
                
        System.out.println("Multiplication Table of " + n);
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(n +" x " + i + " = " + (n*i) );
        }
    }
}
