//WAP to understand the con cept of single level inheritance.

class MLI  //Super class or parent class or one class or base class or old class
{
      double height; 
      void get_height()
      {
        height=3.4;
      }
}
class Data extends MLI    // Intermidate class
{
      double width;
      void get_width()
      {
        width = 4.4;
      }
}
class Rect_Area extends Data   // Sub class or child class or drived class or new class
{
    double result;
    void cal_result()
    {
        result = height * width;
        System.out.println("\n\n Area of Rectangle is:"+result);
    }
}
class SLI
{
   public static void main(String args[])
   {
    Rect_Area ar = new Rect_Area();
    ar.get_height();
    ar.get_width();
    ar.cal_result();
   }
}
