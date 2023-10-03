class GreaterNu1
{
 public static void main(String[] args)  
  {
    double n1=90, n2=40, n3=25;     
  {
    if (n1>=n2) //T
    {
      if (n1>=n3) //T
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
      if (n2>=n3) //F
       {
        System.out.println(+n2+ " is greater number");
       } 
      else    
      {
        System.out.println(+n3+ " is greater number");       
      }
    }
  }
 }  
}