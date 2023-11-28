/* Write a program to print FIBONACII */
//Using for loop

class Fibonacii1
{
 int a, b, sum;
 Fibonacii1(int A, int B)  //Parametrize Constructor or Special Method or Class Name Meyhod
 {
    a = A ;
    b = B;
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
    Fibonacii1 f = new Fibonacii1(1, 0);
    f.display();
 } 
}
