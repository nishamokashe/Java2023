// /*
//  Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
//  Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw 
//  the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to 
//  calculate and return the total surface area of the cylinder.
//  */

 
class Shape 
{
    void draw() 
    {
    }

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
    void draw() 
    {
        System.out.println("Drawing a circle");
    }

    double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Shape
{
    double height;
    double radius;

    Cylinder(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }

    void draw() 
    {
        System.out.println("Drawing a cylinder");
    }

    double calculateArea() 
    {
        return 2 * Math.PI * radius * (height + radius); // TSA = 2πr (h + r) ---> total surface Area
    }
}
class Test_Shape
{ 
    public static void main(String[] args) 
    {
        Circle c = new Circle(3.4);
        c.draw();
        System.out.println("Area of Circle is: " + c.calculateArea());

        Cylinder cy = new Cylinder(33, 12);
        cy.draw();
        System.out.println("Area of Cylinder is: " + cy.calculateArea());
    }
}
