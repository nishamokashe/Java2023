//WAP to calculate the area of troque
class Torque4
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
  public static void main(String[] args)
  {
    double M1=25, M2=12;
   Torque1 t =new Torque1();  //Object creation or Instance Creation
   t.input(M1, M2);   // Method call or Massage Passing or Calling Method with Arg. or Function call
   t.cal();   // Method call or Massage Passing or Calling Method with Arg. or Function call
  }
}