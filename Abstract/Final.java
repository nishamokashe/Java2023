abstract class Shape  
 { 
    String color; 
  
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
  
    // abstract class can have constructor 
    public Shape(String color) 
  { 
    this.color = color; 
  } 

  public String getColor()
  { 
    return color; 
  } 
} 

class Circle extends Shape 
{ 
  double radius; 
  
  public Circle(String color,double radius)
  { 

   // calling Shape constructor 
    super(color); 
    this.radius = radius; 
  } 

    double area()
  { 
    return Math.PI * Math.pow(radius, 2); 
  } 

    public String toString() 
  { 
    return "Area of Circle is : " + area(); 
  } 
  
} 
  class Rectangle extends Shape
{ 

   double length; 
   double width; 
  
   public Rectangle(String color,double length,double width)
  { 
    // calling Shape constructor 
    super(color); 
    this.length = length; 
    this.width = width; 
  } 
  
    double area() 
  { 
    return length*width; 
  } 

  public String toString() 
  { 
    return "Area of Rectangle is : " + area(); 
  } 

} 
 class Test1
{ 
public static void main(String[] args) 
{ 
    Shape s1 = new Circle("Red", 2.2); 
    Shape s2 = new Rectangle("Yellow", 2, 4); 
      
    System.out.println(s1.toString()); 
    System.out.println(s2.toString()); 
} 
  }