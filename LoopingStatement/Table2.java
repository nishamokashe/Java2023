/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table 
of that number. */
//Using while loop.
class Table2
{
 int n=8, i=1;
 void display()
 {
    System.out.println("Multiplication Table of " + n);
   while(i<=10)
   {
    System.out.println(n +" * " + i + " = " + (n*i) );
     i++;
   }
 } 
 public static void main(String[] args)
 {
    Table2 t = new Table2();
    t.display(); 
 }   
}
