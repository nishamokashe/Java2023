class Height          // Super class old class
{
    double h ;
    void get_h()
    {
        h = 2.2;
    }
}
class Radius extends Height   //Intermidiate class
{
    double r;
    void get_r()
    {
        r = 3.2;
    }
}
class Area extends Radius   //Sub class or new class
{
    double area;
    void area_rect()
    {
        area = (2*(22/7.0)*r*h);
        System.out.println("\n\n Area of Cylender is "+area);
    }
    public static void main(String[] args) 
    {
      Area a = new Area();   //Object or instance Creation
      a.get_h();            // Method call or massage passing
      a.get_r();            // Method call or massage passing
      a.area_rect();        // Method call or massage passing
    }
}