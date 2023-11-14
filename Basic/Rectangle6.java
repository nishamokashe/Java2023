class Rectange6
{
    double length, breadth, area;
    void getdata(double L, double B)
    {
       length = L;
       breadth = B; 
    }
    void display()
    {
         area= (length*breadth);
         System.out.println("\n\n Area of rectangle is: "+area);
    }
   public static void main(String[] args)
   {
    double Len = 2.2, Br = 2.5;
     Rectange6 r = new Rectange6();
    r.getdata(Len, Br);
    r.display();
   }    
}
