/* Write a program to print area of two rectangle having side(4,8) and (5,8) by creating class named "Rectangle" with method "Area" which returns the area and length & breadth passed as parameter to its constructor. */
class Rectangle
{
  double length, breadth;
  Rectangle(double l, double b)
  {
    length = l ;
    breadth = b ;
  }
  double Area()
  {
     return (length*breadth);
  }
  public static void main(String[] args)
  {
     Rectangle r1 = new Rectangle(4,5);
     System.out.println("\n Area of first rectangle is:" +r1.Area());
     Rectangle r2 = new Rectangle(5, 8);
     System.out.println("\n Area of second rectangle is:" +r2.Area());
  }
}