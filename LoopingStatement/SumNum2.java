/*Write a program to calculate the sum of first 10 natural number.*/
// Using do while loop

class SumNum2
{
  int i=1, num = 10, sum = 0;   
  void display()
  {
    do
    {
      System.out.println(+i);
      sum=sum+i;
      i++;
    }
    while(i<=num);
    System.out.println("Sum of 10 Natural number is = " + sum);
  }   
public static void main(String[] args)
{
  SumNum2 s = new SumNum2();
  s.display();    
}
}
