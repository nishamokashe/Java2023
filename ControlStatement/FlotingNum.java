class FlotingNum
{
   double x=22.23, y = 22.26;
  void check()
  {
    if (x == y)
    {
        System.out.println("They are the same up to three decimal places");
    }
    else
    {
        System.out.println("They are different");
    }
  } 
  public static void main(String[] args)
  {
    FlotingNum f = new FlotingNum();
    f.check();  
  }   
}
