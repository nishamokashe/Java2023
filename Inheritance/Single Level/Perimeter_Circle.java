/*Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the 
area and perimeter of a circle. */

class Shape
{
    void getPerimeter()
    {
        System.out.println("Perimeter of circle");
    }
    void getArea()
    {
        System.out.println("Area of circle");
    }
}
class Circle extends Shape
{
  double r=4.5,pi=22/7,area;
   void getPerimeter()
    {
        // Circumference = 2πr

        area= 2*pi*r;
        System.out.println("\n Perimeter of circle is: "+area);
    }
    void getArea()
    {
       // A = π × r2	
       
       area = pi*r*r;
       System.out.println("\n Area of circle is: "+area);
    }   
}
class Cir
{
  public static void main(String[] args)
  {
    Circle c = new Circle();
    c.getPerimeter();
    c.getArea();  
  }
}