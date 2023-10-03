/*Write a program to calculate the sum of first 10 natural number.*/
//Using while loop.

class SumNum1
{
  int i=1, num = 10, sum = 0;   
  void display()
  {
    while(i<=num)
    {
      System.out.println(+i);
      sum=sum+i;
      i++;
    }
    System.out.println("Sum of 10 Natural number is = " + sum);
  }   
public static void main(String[] args)
{
  SumNum1 s = new SumNum1();
  s.display();    
}
}
