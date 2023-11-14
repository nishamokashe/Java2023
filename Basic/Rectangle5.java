class Rectange5
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
}
class Rect_Five
{  
   public static void main(String[] args)
   {
     Rectange5 r = new Rectange5();
    r.getdata(2.2, 2.5);
    r.display();
   }    
}
