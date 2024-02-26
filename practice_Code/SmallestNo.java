/* 2. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5
 */
class SmallestNo
{
  double a = 25, b= 37, c=29;
  void check()
  {
    if (a<=b) 
    {
      if (a<=c) 
      {
        System.out.println(+a+ " is Smallest Number");  
      }  
      else
      {
        System.out.println(+c+ " is Smallest Number");
      }
    } 
    else 
    {
      if (b<=c) 
      {
        System.out.println(+b+ " is Smallest Number"); 
      } 
      else
      {
        System.out.println(+c+ " is Smallest Number");
      }
    }
  } 
public static void main(String args[])
 {
    SmallestNo s = new SmallestNo();
    s.check();
 }
}
