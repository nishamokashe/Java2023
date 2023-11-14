/* Write a program to print area of two rectangle having side(4,8) and (5,8) by creating class named "Rectangle" 
with method "Area" which returns the area and length & breadth passed as parameter to its constructor. */

class Rectangle1
{
  double length, breadth;
  Rectangle1()   //  default Constructor or Special Method or Class name Method
  {
    length = 4.5 ;
    breadth = 5.5 ;
  }
  double Area()
  {
     return (length*breadth);
  }
  public static void main(String[] args)
  {
     Rectangle1 r1 = new Rectangle1();
     System.out.println("\n Area of first rectangle is:" +r1.Area());
  }
}