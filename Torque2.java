//WAP to calculate the area of troque
class Torque2
{
  double m1, m2,area;
  void input(double one , double two )
  {
    m1 = one;
    m2 = two;
  }
  void cal()
  {
  //  area =(m1+m2/m1*m2);
   area = m1+m2/m1*m2;
   System.out.println("\n\n Torque is:"+area);
  }
}
class Test
{
  public static void main(String[] args)
  {
   Torque2 t =new Torque2();  //Object creation or Instance Creation
   t.input(25, 12);   // Method call or Massage Passing or Calling Method with Arg. or Function call
   t.cal();   // Method call or Massage Passing or Calling Method with Arg. or Function call
  }
}