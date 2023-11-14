 
class Cylender4
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
    public static void main(String[] args) 
    {
      Cylender4 c = new Cylender4();
      c.getdata(1.6, 1.2);
      c.display();    
    }

}
