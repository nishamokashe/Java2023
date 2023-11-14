 
class Cylender
{
    double PI, r, h, area;
   Cylender()   //  default Constructor or Special Method or Class name Method
   {
     PI = 3.14;
     r = 2.2;
     h = 1.6;
   }
    void display()
    {
        area = (2*PI*r*h);
        System.out.println("\n\n Area of Cylender is: "+area);
    }      
    public static void main(String[] args) 
    {
      Cylender c = new Cylender();
      c.display();    
    }

}
