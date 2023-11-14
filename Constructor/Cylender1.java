 
class Cylender1
{
   double PI, radius, height, area;
   Cylender1(double pi, double r, double h)  //  Parameterized Constructor or Special Method or Class name Method
   {
     PI = pi;
     radius = r; 
     height = h;
   }
    void display()
    {
        area = (2*PI*radius*height);
        System.out.println("\n\n Area of Cylender is: "+area);
    }      
    public static void main(String[] args) 
    {
      Cylender1 c = new Cylender1(3.14, 3.4, 2.2);
      c.display();    
    }

}
