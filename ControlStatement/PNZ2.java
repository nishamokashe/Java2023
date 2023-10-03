public class PNZ2
{
  void check(int n) 
  {
    if (n>0)
    {
        System.out.println(+n+ "is positive Number!");    
    }
    else if (n<0)
    {
        System.out.println(+n+ "is Negative Number!");
    } 
    else 
    {
        System.out.println(+n+ "is Zero!");
    }
  }  
  public static void main(String[] args)
  {
    PNZ2 p = new PNZ2();
    p.check(-30);  
  } 
}
