class Percent3
{
    double obt_marks, tot_marks,per;
    void input(double om, double tm)
    {
        obt_marks = om;
        tot_marks = tm;
    }
    void cal()
    {
        per = ((obt_marks *100)/tot_marks);
        System.out.println("\n\n Percentage of Student is"+per);
    }
}
class Test1
{
    public static void main(String[] args)
    {
      Percent3 p = new Percent3(); //Object creation or Instance Creation
      double o = 433, t=500;
      p.input(o,t);  // Method call or Massage Passing or Calling Method with Arg. or Function call
      p.cal();     // Method call or Massage Passing or Calling Method with Arg. or Function call
    }
}