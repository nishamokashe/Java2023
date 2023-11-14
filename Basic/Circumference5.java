class Circumference5
{
    double PI, r, area;
    void getdata(double pi, double R)
    {
       PI = pi;
       r = R;
    }
    void display()
    {
         area = 2*PI*r;
        System.out.println("\n\n Area of Circumference is: "+area);    
    }
}
class Circumference
{   
    public static void main(String[] args) 
    {
       Circumference5 c = new Circumference5();
       c.getdata(3.14,4.5);
       c.display(); 
    }   
}