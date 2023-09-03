//Area.java
class Circle4
{
   double pi =(22/7), radius, result;
   void input(double r)
   {
    radius = r;
   }
   void cal()
   {
	result=(pi*radius*radius);
	System.out.println(" \n\n Area of circle is"+result);
   }
  public static void main(String args[])
   {
    double Radius=3.2;
    Circle4 c =new Circle4();
    c.input(Radius);
    c.cal();
   }
}