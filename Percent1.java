class Percent1
{
    double obt_marks, tot_marks, per;
    void getdata(double om, double tm)
    {
        obt_marks = om;
        tot_marks = tm;
    }
    void cal()
    {
        per = ((obt_marks*100)/tot_marks);
        System.out.println("\n\n Percentage of sutudent is "+per);
    }
    public static void main(String[] args)
    {
      Percent1 p = new Percent1();  //Object creation or Instance creation
      p.getdata(433, 500);  // Method call or Calling Method without arguments
      p.cal();  // Method call or Calling Method without arguments
    }
}