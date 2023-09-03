//WAP to calaculate area of cylender
class Cylender3
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
class Test1 
{
  public static void main(String[] args) 
  {
    Cylender3 c = new Cylender3();  //Object creation or Instance Creation
    double R=3.2, H=2.5;
    c.input(R,H);  // Method call or Massage Passing or Calling Method with Arg. or Function call
    c.cal();  // Method call or Massage Passing or Calling Method with Arg. or Function call
  }
}
