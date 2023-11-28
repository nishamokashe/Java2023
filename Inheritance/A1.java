class A1
{
  double per, om = 433, tm = 500;
  void calculate()
  {
    per =((om*100)/tm);
  }
}
class B extends A1
{
  void display()
  {
    System.out.println("Percentage of Student is: "+per);
  }
    public static void main(String[] args)
    {
     B a = new B();
     a.calculate();
     a.display();   
    }
}
