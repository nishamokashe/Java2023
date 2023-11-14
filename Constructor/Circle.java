class Circle
{
  double radius, pi, area;
  Circle()  //Special Method or defualt construction 
  {
    radius = 3.4;
    pi = 3.14;
  }    
  void cal()
  {
    area = pi*radius*radius;
    System.out.println("\n\n Area of Circle is "+area);
  }
  public static void main(String[] args)
  {
    Circle c = new Circle();
    c.cal();  
  }
}
