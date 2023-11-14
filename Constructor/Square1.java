class Square1
{
  double side, area;
 
  Square1(double s)  //  Parameterized Constructor or Special Method or Class name Method
  {
    side = s;
  }    
  void display()
  {
    area = side * side;
    System.out.println("Area of Square is: "+area);
  }
  public static void main(String[] args)
  {
    Square1 s = new Square1(25);
    s.display();  
  }
}
