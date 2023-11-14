class Circumference1
{
    double PI, radius, area;
    Circumference1(double r, double p)  //  Parameterized Constructor or Special Method or Class name Method
    {
        PI = p;
        radius = r;
    }
    void display()
    {
         area = 2*PI*radius;
        System.out.println("\n\n Area of Circumference is: "+area);    
    }
    public static void main(String[] args) 
    {
       Circumference1 c = new Circumference1(3.14, 3.4);
       c.display();
    }   
}