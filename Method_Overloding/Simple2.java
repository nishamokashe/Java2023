public class Simple2 
{
    int sum(int x, int y)
    {
      return x+y;
    }
    double sum(double a, double b, double c)
    {
      return a+b+c;
    }
    public static void main(String[] args) 
    {
      Simple2 s2 = new Simple2();
      System.out.println(s2.sum(22, 23));   //Method call inside the print statement
      System.out.println(s2.sum(2.3,3.3,4.5));   //Method call inside the print statement
    }
}
