/*Write a program to find the factorial value of any number entered through the keyboard. */
//Using  while loop.

class Factorial2 
{
 void check()
 {
    int i=1, facto=1, n=8;
    while(i<=n)
    {
       facto=facto*i;
       i++;
    }
    System.out.println("\n factorial of "+n+" is "+facto);
 }  
 public static void main(String[] args)
 {
  Factorial2 f = new Factorial2();
  f.check();   
 }  
}
