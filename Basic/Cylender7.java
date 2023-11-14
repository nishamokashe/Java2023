 
class Cylender7
{
    double PI=3.14, r, h, area;
    void getdata( double R, double H)
    {
        r = R;
        h = H; 
    }
    void display()
    {
        area = (2*PI*r*h);
        System.out.println("\n\n Area of Cylender is: "+area);
    }   
  class Test_Seven
  {
    public static void main(String[] args) 
    {
      double Rr=1.6, Hr=1.2;
      Cylender7 c = new Cylender7();
      c.getdata(Rr,Hr);
      c.display();    
    }
  }   
}
