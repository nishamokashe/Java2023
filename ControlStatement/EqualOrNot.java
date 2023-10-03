class EqualOrNot
{
   int n1 = 2564, n2 = 3526, n3 = 2456;
  void check() 
  {
    if (n1 == n2 && n1 == n3)
    {
        System.out.println("All numbers are equal");
    }
    else if ((n1 == n2) || (n1 == n3) || (n3 == n2))
    {
        System.out.println("Neither all are equal or different");
    }
    else
    {
        System.out.println("All numbers are different");
    }

  } 
  public static void main(String[] args)
  {
    EqualOrNot e = new EqualOrNot();
    e.check();  
  }  
}
