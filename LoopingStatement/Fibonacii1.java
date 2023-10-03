/* Write a program to print FIBONACII */
//Using while loop

class Fibonacii1
{
 int i=1, a=0, b=1, sum;
 void display()
 {
  while(i<=10)
  {
    sum = a +b;
    a=b;
    b=sum;
    System.out.println(" "+sum);
    i++;
  }
 }   
 public static void main(String[] args)
 {
    Fibonacii1 f = new Fibonacii1();
    f.display();
 } 
}
