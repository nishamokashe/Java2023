//WAP to calculate the Square

class Square5
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
    public static void main(String[] args) 
    {
      double SIDE=25;
      Square5 s = new Square5();
      s.getdata(SIDE);
      s.cal();    
    }
}