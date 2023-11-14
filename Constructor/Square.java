class Square
{
  double side, area;

  Square()   //  default Constructor or Special Method or Class name Method
  {
    side = 25;
  }    
  void display()
  {
    area = side * side;
    System.out.println("Area of Square is: "+area);
  }
  public static void main(String[] args)
  {
    Square s = new Square();
    s.display();  
  }
}
