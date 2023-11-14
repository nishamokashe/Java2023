 
class Cylender5
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
  class Cylender_Five
  {       
    public static void main(String[] args) 
    {
      Cylender5 c = new Cylender5();
      c.getdata(1.6, 1.2);
      c.display();    
    }
  }
}
