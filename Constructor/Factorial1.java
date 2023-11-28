/*Write a program to find the factorial value of any number entered through the keyboard. */
//Using for loop.

class Factorial1
{
 int facto, n;
 Factorial1(int F, int N) //  Parameterized Constructor or Special Method or Class name Method
 {
	 facto = F;
	 n = N ;
 }	 
 void check()
 {
    for(int i=1; i<=n; i++)
    {
       facto=facto*i;
    }
    System.out.println("\n factorial of "+n+" is "+facto);
 }  
 public static void main(String[] args)
 {
  Factorial1 f = new Factorial1(1,8);
  f.check();   
 }  
}
