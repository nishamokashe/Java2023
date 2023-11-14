 
class Cylender2
{
    double PI=3.14, r=2.2, h= 1.6, area;
    void cal()
    {
      area = (2*PI*r*h);
    }
    void display()
    {
        System.out.println("\n\n Area of Cylender is: "+area);
    }      
    public static void main(String[] args) 
    {
      Cylender2 c = new Cylender2();
      c.cal();
      c.display();    
    }

}
