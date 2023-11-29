class Shape
{
  void getArea()
  {
      System.out.println("Calculate the area of Rectangle.");

  }
}
class Rectangle extends Shape
{
    double length, width, area;
    Rectangle( double l, double w)
    {
        length = l;
        width = w;
    }
    void getArea()
    {
       area = length*width;
       System.out.println("Area of Rectangle is: "+area);
    }
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(3.4, 4.5);
        r.getArea();
    }
}