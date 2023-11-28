/* Write program to print the even or odd number from first 100 Natural number  */
//Using for loop

class NaturalNum
{ 
   NaturalNum()
   {
    System.out.print("\n Even Number is: \n");  
    for( int i=1;i<=100;i++)
    {
        if (i%2==0)   
        {  
          System.out.print(" "+i);  
        }
    }
    System.out.print("\n Odd Number is: \n");  
    for( int i=1;i<=100;i++)
    {
      if (i%2!=0)
      {
        System.out.print(" "+i);  
      }
    }
   } 
   public static void main(String[] args)
   {
     NaturalNum n = new NaturalNum();
   }
}
