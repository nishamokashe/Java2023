//WAP to calculate the Square

class Square6
{
    double side, area;
    void getdata(double S)
    {
      side = S;
    }
    void cal()
    {
        area=(side*side);
        System.out.println("\n\n Area of Square is: "+area);
    }
  class Test_Six
    {  
      public static void main(String[] args) 
      {
        Square6 s = new Square6();
        s.getdata(25);
        s.cal();    
      }
  } 
}