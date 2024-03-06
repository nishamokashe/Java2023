// Write a java recursive method to calculate Sum of all natural number.

public class SumOfNatNumber
{
   public static int calculate(int n)
   {
    if (n==0) 
    {
      return 0;    
    }
    return n+calculate(n-1);
   }
   public static void main(String[] args) 
   {
      int num =15;
      int sum = calculate(num);
      System.out.println("Sum of number from 1 to "+num+ " is : "+sum); 
   }
}