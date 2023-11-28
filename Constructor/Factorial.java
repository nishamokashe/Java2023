/*Write a program to find the factorial value of any number entered through the keyboard. */
//Using for loop.

class Factorial 
{
 int facto, n;
 Factorial() // Default Constructor or Speical Method or Class Name Method
 {
	 facto = 1;
	 n = 8 ;
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
  Factorial f = new Factorial();
  f.check();   
 }  
}
