//Area.java
class Circle5
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
class Check
{ 
  public static void main(String args[])
  {
   Circle5 c =new Circle5();
   c.input(3.2);
   c.cal();
  }
}