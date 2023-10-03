/* Write program to print the even or odd number from first 100 Natural number  */
//Using for loop

class NaturalNum
{ 
   void display()
   {
    System.out.print("\n Even Number is:");  
    for( int i=1;i<=100;i++)
    {
        if (i%2==0)   
        {  
          System.out.print("\n "+i);  
        }
    }
    System.out.print("\n Odd Number is:");  
    for( int i=1;i<=100;i++)
    {
      if (i%2!=0)
      {
        System.out.print("\n"+i);  
      }
    }
   } 
   public static void main(String[] args)
   {
     NaturalNum n = new NaturalNum();
     n.display(); 
   }
}
