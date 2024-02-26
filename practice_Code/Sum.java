//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
class Sum
{
  public static void main(String args[])
 {
   int  i,n=0, s=0 ;
   double Avg;
  
   {
     System.out.println("Input the 5 numbers : 5 ");
   }
    for(i=1;i<=5;i++)
     {
       System.out.print("\n"+i);
       s=s+i;
     }
     System.out.println("\nThe sum of the given number is " + s);
     Avg = s/5;
     System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +Avg);

  }
}
