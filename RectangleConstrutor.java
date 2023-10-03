public class RectangleConstrutor 
{
    double length=12, width=7, area,P;

    void getArea()
    {
        area= (length*width);
        System.out.println("\n Area of rectangle is"+area);
    }
   void getPerimeter()
   {
       P = 2 * (length +width);  
       System.out.println("\n Perimeter of rectangle is"+P);
   }
   public static void main(String[] args)
   {
     RectangleConstrutor r = new RectangleConstrutor();
     r.getArea();
     r.getPerimeter(); 
   }
}
