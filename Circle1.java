//Area.java
class Circle1
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
   Circle1 c =new Circle1();
   c.input(3.2);
   c.cal();
  }
}