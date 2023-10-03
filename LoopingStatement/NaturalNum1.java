/* Write program to print the even or odd number from first 100 Natural number  */
//Using while loop

class NaturalNum1
{ 
    int i=1;
   void display()
   {
    System.out.print("\n Even Number is:");  
    while(i<=100)
    {
        if (i%2==0)   
        {  
          System.out.print("\n "+i);  
        }
        i++;
    }
     System.out.print("\n Odd Number is:");  
    for( int i=1;i<=100;i++)
    {
      if (i%2!=0)
      {
        System.out.print("\n"+i);  
      }
      i++;
    }
   } 
   public static void main(String[] args)
   {
     NaturalNum1 n = new NaturalNum1();
     n.display(); 
   }
}
