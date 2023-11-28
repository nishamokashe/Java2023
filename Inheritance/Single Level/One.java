class A
{
    int x;
    void get_x()
    {
        x = 10;
    }
}
class B extends A
{
  void get()
  {
    System.out.println("The value of X is: "+x);
  }
}
class Test
{
    public static void main(String[] args)
    {
      B b = new B();
      b.get_x();
      b.get();    
    }
}