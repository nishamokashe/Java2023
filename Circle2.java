//Area.java
class Circle2
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
}
class Test
{  
  public static void main(String args[])
  {
   Circle2 c =new Circle2();
   c.input(3.2);
   c.cal();
  }
}