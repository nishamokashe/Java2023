//WAP to understand the con cept of single level inheritance.

class Data  //Super class 
{
      double height,width; 
      void get_height()
      {
        height=3.4;
      }
      void get_width()
      {
        width = 4.4;
      }
}
class Area_Rect extends Data  //Sub class 
{
    double area;
    void calulate_area()
    {
        area = height * width;
        System.out.println("\n\n Area of Rectangle is:"+area);
    }
}
class SLI
{
   public static void main(String args[])
   {
    Area_Rect ar = new Area_Rect();
    ar.get_height();
    ar.get_width();
    ar.calulate_area();
   }
}
