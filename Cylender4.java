//WAP to calaculate area of cylender
class Cylender4
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
  public static void main(String[] args) 
  {
    double Radius=3.2, Height=2.5;
    Cylender4 c = new Cylender4();  //Object creation or Instance Creation
    c.input(Radius,Height);  // Method call or Massage Passing or Calling Method with Arg. or Function call
    c.cal();  // Method call or Massage Passing or Calling Method with Arg. or Function call
  }
}
