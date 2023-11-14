class Circle1
{
  double radius, pi, area;
  Circle1(double r, double p)  //Special Method or Parameterized construction 
  {
    radius = r;
    pi = p;
  }    
  void cal()
  {
    area = pi*radius*radius;
    System.out.println("\n\n Area of Circle is "+area);
  }
  public static void main(String[] args)
  {
    Circle1 c = new Circle1(3.4, 3.14);
    c.cal();  
  }
}
