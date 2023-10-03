/* Write a program to print FIBONACII */
//Using do while loop

class Fibonacii2
{
 int i=1, a=0, b=1, sum;
 void display()
 {
  do
  {
    sum = a +b;
    a=b;
    b=sum;
    System.out.println(" "+sum);
    i++;
  }
  while(i<=10);
 }   
 public static void main(String[] args)
 {
    Fibonacii2 f = new Fibonacii2();
    f.display();
 } 
}
