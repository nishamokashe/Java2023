/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table 
of that number. */
//Using for loop.

class Tabl
{
 int n=4;
 void display()
 {
    System.out.println("Multiplication Table of " + n);
   for(int i=1; i<=10; i++)
   {
    System.out.println(n*i);
   }
 } 
 public static void main(String[] args)
 {
    Tabl t = new Tabl();
    t.display(); 
 }   
}
