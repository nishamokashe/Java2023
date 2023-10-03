public class OddEven1
{
  void check(int n)
  {
    if (n % 2 == 0)
    {
       System.out.println(+n+ "is Even number"); 
    } 
    else 
    {
        System.out.println(+n+ "is Odd number"); 
    }
  }  
  public static void main(String[] args)
  {
    OddEven1 e = new OddEven1();
    e.check(30);
    e.check(75);
  }  
}
