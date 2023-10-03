/*Write a program to find the factorial value of any number entered through the keyboard. */
// Using do while

class Factorial3 
{
 void check()
 {
    int i=1,facto=1, n=8;
    do
    {
       facto=facto*i;
       i++;
    }
    while( i<=n);
    System.out.println("\n factorial of "+n+" is "+facto);
 }  
 public static void main(String[] args)
 {
  Factorial3 f = new Factorial3();
  f.check();   
 }  
}
