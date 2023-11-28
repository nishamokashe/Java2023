/* Write a program to print FIBONACII */
//Using for loop

class Fibonacii
{
 int a, b, sum;
 Fibonacii()  //Default Constructor or Special Method or Class Name Meyhod
 {
    a = 1 ;
    b = 0;
 }
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
