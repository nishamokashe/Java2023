class GreaterNu
{
   double n1=20, n2=40, n3=25;
   void check()
  {
    if (n1>=n2)
    {
      if (n1>=n3)
      { 
         System.out.println(+n1+ " is greater number");
      } 
      else 
      {
        System.out.println(+n3+ " is greater number");   
      }   
    }
    else
    {
      if (n2>=n3) 
       {
        System.out.println(+n2+ " is greater number");
       } 
      else    
      {
        System.out.println(+n3+ " is greater number");       
      }
    }
  }  
  public static void main(String args[])
  {
   GreaterNu n = new GreaterNu();
   n.check();
  }
}
