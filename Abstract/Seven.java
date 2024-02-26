abstract class Shape
{
    String colour = "Read";

    void getColour()
    {
        System.out.println("Shape colour is"+colour);
    }
  // thes are the abstract method
    public abstract double area();
    public abstract String toString();
}
class Circle extends Shape
{
    double Radius=2.2,Area ;
    public double area()
    {
        // Area = Area=(22/7*Radius*Radius); 
       return Area=(22/7*Radius*Radius);
    }
     public String toString()
    {
        return "Area of circle is"+Area;
    }
}
class Rectangle extends Shape
{
   double length =3.4 , width=2.2, Area;

    public double area()
    {
       return Area = (length*width);
    }
    public String toString()
    {
       return "Area of Rectangle"+Area;
    }
}
class Check 
{
    public static void main(String[] args)
    {
     Shape c1 = new Circle();
     c1.getColour();
     c1 .area();
     c1.toString();

     Shape r2 = new Rectangle();   
     r2 .area();
     r2.toString();
     
    }
}