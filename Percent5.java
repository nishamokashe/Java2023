 class Percent5
{
    double om, tm,per;
    void getdata(double o, double t)   // getdata() defination
    {
        om = o;
        tm = t;
    }
    void cal()    // Cal() defination
    {  
        per = ((om*100)/tm);
        System.out.println("\n\n Percentage of Student is"+per);
    }
}
class Check
{
    public static void main(String[] args)
    {
      Percent5 p = new Percent5(); //Object creation or Instance Creation
      p.getdata(433,500);  // Method call or Massage Passing or Calling Method with Arg. or Function call
      p.cal();     // Method call or Massage Passing or Calling Method with Arg. or Function call
    }
}