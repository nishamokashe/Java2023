/* Write a program to print FIBONACII */
//Using for loop

class Fibonacii
{
 int a=0, b=1, sum;
 void display()
 {
  for(int i=1; i<=10; i++)
  {
    sum = a +b;
    a=b;
    b=sum;
    System.out.println(" "+sum);
  }
 }   
 public static void main(String[] args)
 {
    Fibonacii f = new Fibonacii();
    f.display();
 } 
}
