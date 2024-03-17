/*
 Write a Java program to create a base class Shape with a method called calculateArea(). 
 Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass 
 to calculate and return the shape's area.
 */

class Shape1 
{
   double calculateArea()
  {
     return 0;
  }
    
}
class Circle extends Shape
{
    double radius;
     Circle(double radius)
    {
       this.radius = radius;
    }
    @Override
    
     double calculateArea()
    {
        return Math.PI * radius * radius;
    }   
}
class Rectangle extends Shape
{
    double width;
    double height;
    Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    @Override

     double calculateArea()
    {
        return width * height; 
    }   
}
class Triangle extends Shape
{
    double height;
    double base;
    Triangle(double height,double base)
    {

    }
    @Override

     double calculateArea()
    {
        return 0.5 * base * height; // 1/2*b*h
    }   
}
class Test_cal
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(4);
        System.out.println("Area of Circle: "+c.calculateArea());
       

        Rectangle r = new Rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " +r.calculateArea());

        Triangle t = new Triangle(18, 20);
        System.out.println("\nArea of Triangle: " +t.calculateArea());      
    }
}
