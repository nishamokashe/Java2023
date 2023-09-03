//WAP to calculate the area of troque
class Torque3
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
class Test1
{
  public static void main(String[] args)
  {
   Torque3 t =new Torque3();  //Object creation or Instance Creation
   double O=25 , T=12;
   t.input(O,T);   // Method call or Massage Passing or Calling Method with Arg. or Function call
   t.cal();   // Method call or Massage Passing or Calling Method with Arg. or Function call
  }
}