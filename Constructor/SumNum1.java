/*Write a program to calculate the sum of first 10 natural number.*/
//Using for loop.

class SumNum1
{
  int i, num , sum ; 
  SumNum1(int N,int S)   // Paramtarize Constructor or Special Method or Class Name Method
  {
    num = N;
    sum = S;
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
  SumNum1 s = new SumNum1(20,0);
  s.display();    
}
}
