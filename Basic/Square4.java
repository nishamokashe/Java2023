//WAP to calculate the Square

class Square4
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
      Square4 s = new Square4();
      s.getdata(25);
      s.cal();    
    }
}