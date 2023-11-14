class Circumference
{
    double PI, radius, area;
    Circumference()   //  default Constructor or Special Method or Class name Method
    {
        PI = 3.14;
        radius = 3.4;
    }
    void display()
    {
         area = 2*PI*radius;
        System.out.println("\n\n Area of Circumference is: "+area);    
    }
    public static void main(String[] args) 
    {
       Circumference c = new Circumference();
       c.display();
    }   
}