class Circumference4
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
    public static void main(String[] args) 
    {
       Circumference4 c = new Circumference4();
       c.getdata(3.14,4.5);
       c.display(); 
    }   
}