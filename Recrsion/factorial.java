
/*Write a program to find the factorial value of any number entered through the keyboard. */
//Using for loop.
// Simple program

class Factorial 
{
 void check()
 {
    int facto=1, n=8;
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
