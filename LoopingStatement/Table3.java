/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table 
of that number. */
// Using do while loop

class Table3
{
 int n=8, i=1;
 void display()
 {
    System.out.println("Multiplication Table of " + n);
   do
   {
    System.out.println(n +" * " + i + " = " + (n*i) );
     i++;
   }
 while(i<=10);
} 
 public static void main(String[] args)
 {
    Table3 t = new Table3();
    t.display(); 
 }   
}
