/* Write program to print the even or odd number from first 100 Natural number  */
//Using do while loop

class NaturalNum2
{ 
    int i=1;
   void display()
   {
    System.out.print("\n Even Number is:");  
    do
    {
        if (i%2==0)   
        {  
          System.out.print("\n "+i);  
        }
        i++;
    }
    while(i<=100);
     System.out.print("\n Odd Number is:");  
    for( int i=1;i<=100;i++)
    {
      if (i%2!=0)
      {
        System.out.print("\n"+i);  
      }
      i++;
    }
    while(i<=100);
   } 
   public static void main(String[] args)
   {
     NaturalNum2 n = new NaturalNum2();
     n.display(); 
   }
}
