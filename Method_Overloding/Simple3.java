// Method Overloding is not possible by changing the return type of method
public class Simple3 
{
  double sum(int x, int y)    // double sum(double x, double y)
  {
    return(x+y);
  }  
  int sum(int a, int b)  
  {
    return(a+b);
  }
  public static void main(String[] args) 
  {
    Simple3 s3 = new Simple3();
    System.out.println(s3.sum(22, 23));   //Method call inside the print statement  // Note: Ambigity Error
    System.out.println(s3.sum(21,44));   //Method call inside the print statement
  }
}
