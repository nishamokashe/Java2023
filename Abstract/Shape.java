abstract class Shape  
 { 
    String color; 
  
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 

    void getColour(String c)
    {
        color=c;
        System.out.println("Shape colour is");
    }
} 

class Circle extends Shape 
{ 
  double radius; 
  
  public Circle(double radius)
  { 
    this.radius = radius; 
  } 

    double area()
  { 
    return 22/0.7*radius*radius; 
  } 

    public String toString() 
  { 
    return " area of Circle is : " + area();     
  } 
  
} 
  class Rectangle extends Shape
{ 

   double length; 
   double width; 
  
   public Rectangle(double length,double width)
  { 
    this.length = length; 
    this.width = width; 
  } 
  
    double area() 
  { 
    return length*width; 
  } 

  public String toString() 
  { 
    return "and area is : " + area(); 
  } 

} 
 class Shape_Test
{ 
public static void main(String[] args) 
{ 
    Shape s1 = new Circle( 2.2); 
    Shape s2 = new Rectangle(2, 4); 
      
    System.out.println(s1.toString()); 
    System.out.println(s2.toString()); 
} 
  }