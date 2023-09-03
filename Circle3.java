//Area.java
class Circle3
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
class Test1
{ 
  public static void main(String args[])
  {
   Circle3 c =new Circle3();  //Object creation or Instance Creation 
   double R=3.2;
   c.input(R); //Method call or massage passing or Calling Method arguments or function call 
   c.cal();  //Method call or massage passing or Calling Method arguments or function call
  }
}