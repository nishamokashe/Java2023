//WAP to calaculate area of cylender
class Cylender2
{
  double radius, height , area;
  void input(double r,double h)
  {
    radius = r;
    height = h;
  }
  void cal()
  {
    area=(2*(22/7)*radius*height);
	System.out.println("\n\n Area of Cylnder is"+area);
  }
}
class Test
{ 
  public static void main(String[] args) 
  {
    Cylender2 c = new Cylender2();  //Object creation or Instance Creation
    c.input(3.2, 2.5);  // Method call or Massage Passing or Calling Method with Arg. or Function call
    c.cal();  // Method call or Massage Passing or Calling Method with Arg. or Function call
  }
}
