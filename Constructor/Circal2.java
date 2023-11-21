class Circle2
{
  double radius, pi, area;
  Circle2(double r, double p)  //Special Method or Parameterized construction 
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
    double P=3.4, R=3.14;
    Circle2 c = new Circle2(P,R);
    c.cal();  
  }
}
