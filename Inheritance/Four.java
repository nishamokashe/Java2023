/* Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called 
Rectangle that overrides the getArea() method to calculate the area of a rectangle. */

class Shape
{
    void getArea()
    {
        System.out.println("The area of rectangle is:");
    }
}
class Rectangle extends Shape
{
    void getArea()
    {
      double height,width;
      double area; 
      
        height= 3.4;
        width = 4.4;

        area = height * width;
        System.out.println("The area of the rectangle is: " + area);

      
    }
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.getArea();
    }
}