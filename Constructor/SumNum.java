/*Write a program to calculate the sum of first 10 natural number.*/
//Using for loop.

class SumNum
{
  int i, num , sum ; 
  SumNum()   // Default Constructor or Special Method or Class Name Method
  {
    num = 20;
    sum = 0;
  }  
  void display()
  {
    for(i=1; i<=num;i++)
    {
      System.out.println(+i);
      sum=sum+i;
    }
    System.out.println("Sum of 10 Natural number is = " + sum);
  }   
public static void main(String[] args)
{
  SumNum s = new SumNum();
  s.display();    
}
}
