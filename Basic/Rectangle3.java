class Rectange3
{
    double length=2.2, breadth=2.5, area;
    void cal()
    {
        area= (length*breadth);
    }
    void display()
    {
         System.out.println("\n\n Area of rectangle is: "+area);
    }
}  
  class Rect_test
{   
   public static void main(String[] args)
   {
     Rectange3 r = new Rectange3();
    r.cal();
    r.display();
   }    
}
