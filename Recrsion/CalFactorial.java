/*Write a program to find the factorial value of any number entered through the keyboard. */
// Using Recursive method

public class CalFactorial 
{
  public static int calculate(int n,int facto)
  {
     for(int i=1; i<=n; i++)
     {
       facto= facto *i;
     }
     return 0;
  } 
  public static void main(String[] args) 
  {
    int num = 8;
    int f = 1;
    int sum = calculate(num,f); 
    System.out.println("Factorial of "+num+" is :" +sum);
  } 
}
