public class EvenOdd2
{
  void check(int n)
  {
    if (n % 2 ==0)
    {
     if (n % 6 == 0)
       {
        System.out.println(+n+"is even number and it is divisible by 6" );
       }
      else
       {
        System.out.println(+n+"is odd number and it is not divisible by 6");
       }    
    }
    else
    {
        if (n % 3 == 0)
        {
         System.out.println(+n+"is odd number and it is divisible by 3" );  
        } 
        else
        {
         System.out.println(+n+"is odd number and it is not divisible by 3" );
        }
    }
  }  
  public static void main(String[] args)
  {
   EvenOdd2 e = new EvenOdd2();
   e.check(54);  
  }  
}
