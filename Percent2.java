class Percent2
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
class Test
{
    public static void main(String[] args)
    {
      Percent2 p = new Percent2(); //Object creation or Instance Creation
      p.input(433, 500);  // Method call or Massage Passing or Calling Method with Arg. or Function call
      p.cal();     // Method call or Massage Passing or Calling Method with Arg. or Function call
    }
}