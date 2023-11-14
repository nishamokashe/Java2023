class Rectange2
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
   public static void main(String[] args)
   {
     Rectange2 r = new Rectange2();
    r.cal();
    r.display();
   }    
}
